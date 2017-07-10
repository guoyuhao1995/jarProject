package com.dryork.util;

/**
 * 在redis存储的数据的key的前缀，缓存类和持久的分开
 * key的变量部分要能在数据库中找到
 * 
 * @author lilianzhi
 *
 */
public class RedisKey {
	
	/**用户信息在redis中的保存时间(3)*/
	public static final int USER_EXPIRE_TIME=60*60*24*3;
	
	/**群组信息在redis中的保存时间(2)*/
	public static final int GROUPINFO_EXPIRE_TIME=60*60*24*2;
	
	
	/**用户信息缓存key :user_uid*/
	public static String getDocInfoKey(String did){
		return "doc_".concat(did);
	}
	
	/**用户发送手机验证码*/
	public static String getCheckMobileCode(String mobile){
		return "mobile_check_".concat(mobile);
	}
	
	/**用户医院缓存key :id*/
	public static String getDocHospitalKey(String id){
		return "doc_hospital_".concat(id);
	}
	
	/**用户科室缓存key :id*/
	public static String getDocDeptKey(String id){
		return "doc_dept_".concat(id);
	}
	
	/**用户职称缓存key :user_uid*/
	public static String getDocTitleKey(String id){
		return "doc_title_".concat(id);
	}
	
	/**聊天室下用户列表信息缓存key :user_uid*/
	public static String getChatUserMapkey(String chatid){
		return "chat_usermap_".concat(chatid);
	}
	/**用户下的聊天室新消息列表，含群*/
	public static String getUserChatMapkey(String userandtype){
		return "user_chatmap_".concat(userandtype);
	}
	
	/**用户下的聊天室最后id列表，含群*/
	public static String getUserChatLMsgMapkey(String userandtype){
		return "user_chatlastmsgmap_".concat(userandtype);
	}
	
	public static String getUserChangeMapkey(String userandtype){
		return "user_changemsgmap_".concat(userandtype);
	}
	
	/**群组信息缓存key :group_groupid*/
	public static String getGroupInfoKey(String groupId){
		return "group_".concat(groupId);
	}
	
	/**群组医生数量缓存key :group_groupid*/
	public static String getGroupDenNumKey(String groupId){
		return "group_dent_num".concat(groupId);
	}
	
	/**群组患者数量缓存key :group_groupid*/
	public static String getGroupPatNumKey(String groupId){
		return "group_pat_num".concat(groupId);
	}
	
	/**医生患者数量缓存key :group_groupid*/
	public static String getPatientNumKey(String did){
		return "dent_pat_num".concat(did);
	}
	
	/**群组今日新增患者数量缓存key :group_groupid*/
	public static String getGroupNewPatNumKey(String groupId){
		return "group_new_pat_num".concat(groupId);
	}
	
	/**群组今日新增预约数量缓存key :group_groupid*/
	public static String getGroupNewAppoNumKey(String groupId){
		return "group_newappo_num".concat(groupId);
	}
	
	/**标签下用户数key :label_id*/
	public static String getUserLabelNumKey(String labelId){
		return "user_label_num".concat(labelId);
	}


	
	/**用户好友关系key*/
	public static String getUserFriendKey(String uid){
		return "user_friend_key_".concat(uid);
	}
	
	/**微信用户key*/
	public static String getWXUserInfoKey(String wxuid){
		return "wxuser_info_key_".concat(wxuid);
	}
	
	/**用户信息key*/
	public static String getPatUserInfoKey(String pid){
		return "patuser_info_key_".concat(pid);
	}
	
	/**医生用户关系信息key*/
	public static String getDentPatMapKey(String did,String pid){
		return "dentpat_map_key_".concat(did).concat("_").concat(pid);
	}

	
	/**短信验证码*/
	public static String getValidateKey(String mobile,int type){
		return "validate_key_"+type+"_"+mobile;
	}
	
	/**短信验证码*/
	public static String getJPushQKey(){
		return "yueke_queue_jpush";
	}
	
	/**微信临时文件*/
	public static String getWXMedia(String key){
		return "yueke_wx_"+key;
	}
	
	/**用户购物车**/
	public static String get2cShoppingCartKey(String uid){
		return "2c_shopping_cart_" + uid;
	}

	/**用户购物车中  用户选中的商品IDs**/
	public static String get2cShoppingCartSelectedProductField(){
		return "2c_shopping_cart_selected";
	}
	
	/**电商中  用户在商品详情页面点击立即购买，记录商品ID**/
	public static String get2cDirectBuyProductId(){
		return "2c_direct_buy_product";
	}
	
	/**聊天中  缓存医生的总未读消息数*/
	public static String getDentistCount(Long did){
		return did+"_chat_count";
	}
	
	/**定时任务  存放上次查询时间*/
	public static String getTime(){
		return "dataCenter_slect_time";
	}
	
	/**用户在某聊天室内lastmsgId*/
	public static String getLastMsgId(Long did,Long chatId){
		return "lastmsgid_"+did+"_"+chatId;
	}
	
	/**医生所有未读聊天室信息*/
	public static String getDentistChat(Long did){
		return "count_chat_"+did;
	}
	
	/*医生在某聊天室内的未读消息*/
	public static String getDentistChatCount(Long did,Long chatId){
		return "count_"+did+"_"+chatId;
	}
	
	/**/
	public static String getDentistLastCookie(Long did){
		return "last_cookie_"+did;
	}
	
	public static String plantingFocusImg(){
		return "focusImgToken";
	}
	//查看医生在此聊天下是否收到过提醒
	public static String getIsTXDentist(Long did,Long chatId){
		return "tx_"+did+"_"+chatId;
	}
}
