package com.dryork.main;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import com.dryork.util.DateUtils;
import com.dryork.util.MyBatisUtil;
import com.dryork.util.RedisClient;
import com.dryork.util.RedisKey;

public class Admin {
	static YkDentistMapper ykDentistDao = null;
	static YkChatMapper ykChatDao = null;
	static YkPatientDentistMappingMapper ykPatientDentistMappingDao = null;
	static YkUserextMapper ykUserextDao = null;
	static YkChatrecordMapper ykChatrecordDao = null;
	static{
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		ykDentistDao = sqlSession.getMapper(YkDentistMapper.class);
		ykChatDao = sqlSession.getMapper(YkChatMapper.class);
		ykPatientDentistMappingDao = sqlSession.getMapper(YkPatientDentistMappingMapper.class);
		ykUserextDao = sqlSession.getMapper(YkUserextMapper.class);
		ykChatrecordDao = sqlSession.getMapper(YkChatrecordMapper.class);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("脚本开始时间--------->"+DateUtils.date2Str(new Date(), "yyyy-MM-dd HH:mm:ss sss"));
		RedisClient redisClient = new RedisClient(20, 20, 20, "192.168.0.7", 6379);
		YkDentist ykDentist = new YkDentist();
		ykDentist.setSqlStr(" and id > 3");
		List<YkDentist> listDentist = ykDentistDao.selectList(ykDentist);
		int i=0;
		for(YkDentist record : listDentist){
			Map<String, String> usermap = redisClient.HASH.hgetall(RedisKey.getDentistChat(record.getId()));
			if(usermap != null){
				try {
					i++;
					Iterator<String> iterator = usermap.keySet().iterator();
					while (iterator.hasNext()) {
						String chatid = iterator.next();
						String lastmsgid = redisClient.STRINGS.get(RedisKey.getLastMsgId(record.getId(), Long.parseLong(chatid)));
						YkChat ykChat = ykChatDao.selectByPrimaryKey(Long.parseLong(chatid));
						if(ykChat != null && ykChat.getChatType() != 3){
							System.out.println(record.getId()+" 医生:"+record.getUsername()+"在聊天室id为"+chatid+"中的lastmsgid为:"+lastmsgid);
							System.out.println("\t聊天室成员有:");
							getName(ykChat.getUid1(),ykChat.getUid1Type());
							getName(ykChat.getUid2(),ykChat.getUid2Type());
							if(ykChat.getChatType() == 5 && ykChat.getFromDid() != null && ykChat.getFromDid().longValue() != 0L){
								getName(ykChat.getFromDid(),2);
							}
							if(ykChat.getChatType() == 1){
								YkPatientDentistMapping mapping = new YkPatientDentistMapping();
								mapping.setDentistId(ykChat.getUid1Type() == 2 ? ykChat.getUid1(): ykChat.getUid2());
								mapping.setUserId(ykChat.getUid1Type() == 2 ? ykChat.getUid2() : ykChat.getUid1());
								mapping = ykPatientDentistMappingDao.selectOne(mapping);
								if(mapping != null && mapping.getAssisId() != null){
									getName(mapping.getAssisId(),6);
								}
							}
							getContent(Long.parseLong(chatid), Integer.parseInt(lastmsgid));
						}else{
							System.out.println("缓存中存在，但数据库中不存在该聊天室"+record.getId()+"在聊天室id为"+chatid+"中的lastmsgid为："+lastmsgid);
						}
						System.out.println();
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("一共有"+i+"位医生有未读消息");
		System.out.println("脚本结束时间--------->"+DateUtils.date2Str(new Date(), "yyyy-MM-dd HH:mm:ss"));
	}
	static void getName(Long id,Integer type){
		if(type == 2 || type == 6){
			YkDentist ykDentist = ykDentistDao.selectByPrimaryKey(id);
			if(ykDentist != null ){
				System.out.println("\t\tid:"+id+",name:"+ykDentist.getUsername()+"医生");
			}
		}else if(type == 1){
			YkUserext ykUserext = ykUserextDao.selectByPrimaryKey(id);
			if(ykUserext != null){
				System.out.println("\t\tid:"+id+",name:"+ykUserext.getYkuserName()+"患者");
			}
		}
	}
	
	static void getContent(Long chatId,Integer lastmsgId){
		YkChatrecord record = new YkChatrecord();
		record.setChatId(chatId);
		record.setSqlStr(" and id > "+lastmsgId);
		List<YkChatrecord> list = ykChatrecordDao.selectList(record);
		if(list != null && list.size() > 0){
			for(int i=0,size=list.size();i<size;i++){
				StringBuffer name = new StringBuffer("");
				if(list.get(i).getSenderType() == 2 || list.get(i).getSenderType() == 6){
					YkDentist dentist = ykDentistDao.selectByPrimaryKey(list.get(i).getSenderId());
					name.append(dentist != null ? dentist.getUsername():"");
					name.append("医生在");
				}
				if(list.get(i).getSenderType() == 1){
					YkUserext ykUserext = ykUserextDao.selectByPrimaryKey(list.get(i).getSenderId());
					name.append(ykUserext != null ? ykUserext.getYkuserName() : "");
					name.append("患者在");
				}
				name.append(DateUtils.date2Str(list.get(i).getCreateTime(), "yyyy-MM-dd HH:mm:ss"));
				name.append("发送:");
				System.out.println("\t"+name.toString()+"聊天id:"+list.get(i).getId()+"聊天内容:"+list.get(i).getContent());
			}
		}
	}

}
