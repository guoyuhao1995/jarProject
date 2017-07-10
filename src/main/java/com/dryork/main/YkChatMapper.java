package com.dryork.main;

import java.util.List;

public interface YkChatMapper {
	
	List<YkChat> selectByAmostId(List<Long> ids);
    
    int deleteByPrimaryKey(Long id);

    
    int insert(YkChat record);

    
    int insertSelective(YkChat record);

    
    YkChat selectByPrimaryKey(Long id);

    
    int updateByPrimaryKeySelective(YkChat record);

    
    int updateByPrimaryKey(YkChat record);

	YkChat selectOne(YkChat record);

	List<YkChat> selectList(YkChat record);

	int selectCount(YkChat record);

	int deleteSelective(YkChat record);
}