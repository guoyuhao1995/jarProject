package com.dryork.main;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.dryork.util.MyBatisUtil;

public class Jdbc {

	public static void wirteXls() throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		//QsyyMapper mapper = sqlSession.getMapper(QsyyMapper.class);
		
	}

}
