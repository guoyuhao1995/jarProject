package com.dryork.main;

import java.util.List;
import java.util.Map;

public interface QsyyMapper {

	List<Map<String, Object>> conventionalTreatmentList(List<String> list);

	List<Map<String, Object>> selectList();
}
