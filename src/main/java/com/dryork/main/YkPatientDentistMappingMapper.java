package com.dryork.main;

import java.util.List;

public interface YkPatientDentistMappingMapper {

	int deleteByPrimaryKey(Long id);

	int insert(YkPatientDentistMapping record);

	int insertSelective(YkPatientDentistMapping record);

	YkPatientDentistMapping selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(YkPatientDentistMapping record);

	int updateByPrimaryKey(YkPatientDentistMapping record);

	YkPatientDentistMapping selectOne(YkPatientDentistMapping record);

	List<YkPatientDentistMapping> selectList(YkPatientDentistMapping record);

	int selectCount(YkPatientDentistMapping record);

	int deleteSelective(YkPatientDentistMapping record);
	
	void updateAssistantByDid(YkPatientDentistMapping record);
	
	List<YkPatientDentistMapping> getAllOpenAssistant();
	
	int updateByPrimaryAssisIDKey(YkPatientDentistMapping record);
}