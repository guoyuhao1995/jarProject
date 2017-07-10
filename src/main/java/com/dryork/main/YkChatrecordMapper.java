package com.dryork.main;

import java.util.List;

public interface YkChatrecordMapper {
	
	public List<YkChatrecord> selectByChatIds(List<Long> list);
    
    int deleteByPrimaryKey(Long id);

    
    int insert(YkChatrecord record);

    
    int insertSelective(YkChatrecord record);

    
    YkChatrecord selectByPrimaryKey(Long id);

    
    int updateByPrimaryKeySelective(YkChatrecord record);

    
    int updateByPrimaryKey(YkChatrecord record);

	YkChatrecord selectOne(YkChatrecord record);

	List<YkChatrecord> selectList(YkChatrecord record);

	int selectCount(YkChatrecord record);

	int deleteSelective(YkChatrecord record);
	
	int updateByPrimaryTxtMsg(YkChatrecord record);
}