package com.dryork.main;

import java.util.List;

public interface YkUserextMapper {
	int selectFamlyCount(YkUserext record);
	int selectVipCount(YkUserext record);
    
    int deleteByPrimaryKey(Long id);

    
    int insert(YkUserext record);

    
    int insertSelective(YkUserext record);

    
    YkUserext selectByPrimaryKey(Long id);

    YkUserext selectByPrimaryWxuid(Long wxuid);
    
    int updateByPrimaryKeySelective(YkUserext record);

    
    int updateByPrimaryKey(YkUserext record);

	YkUserext selectOne(YkUserext record);

	List<YkUserext> selectList(YkUserext record);

	int selectCount(YkUserext record);

	int deleteSelective(YkUserext record);
	
	List<YkUserext> checkPatientByEdit(YkUserext record);
	List<YkUserext> checkPatient(YkUserext record);
	
	String selectNameById(Long id);
}