package com.dyl.mybatis.untils;



import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	private static SqlSessionFactoryBuilder ssfb =new SqlSessionFactoryBuilder();
	public static SqlSessionFactory getSqlSessionFactoty(String fileName) throws IOException{
		InputStream iStream = Resources.getResourceAsStream(fileName);
		SqlSessionFactory sqlSessionFactory = ssfb.build(iStream);
		return sqlSessionFactory;
	}
}
