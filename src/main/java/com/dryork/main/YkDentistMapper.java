package com.dryork.main;

import java.util.List;

public interface YkDentistMapper {
    
    int deleteByPrimaryKey(Long id);

    
    int insert(YkDentist record);

    
    int insertSelective(YkDentist record);

    
    YkDentist selectByPrimaryKey(Long id);

    
    int updateByPrimaryKeySelective(YkDentist record);

    
    int updateByPrimaryKey(YkDentist record);

	YkDentist selectOne(YkDentist record);

	List<YkDentist> selectList(YkDentist record);

	int selectCount(YkDentist record);

	int deleteSelective(YkDentist record);
	
	YkDentist getByIdOrMobile(Long number);
	
	List<YkDentist> selectPlantingExperts();

	List<YkDentist> selectDocList4xiaoyayi(YkDentist record);
}