package com.dyl.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dyl.mybatis.mapper.UserMapper;
import com.dyl.mybatis.pojo.User;
import com.dyl.mybatis.untils.MybatisUtil;

public class UserMapperTest {

	@Test
	public void findUserById() throws IOException{
		//加载核心配置文件
				String resource = "sqlMapConfig.xml";
				InputStream in = Resources.getResourceAsStream(resource);
				//创建SqlSessionFactory
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
				//创建SqlSession
				SqlSession sqlSession = sqlSessionFactory.openSession();
				
				//SqlSEssion帮我生成一个实现类  （给接口）
				UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
				
				
				User user = userMapper.findUserById(25);
				System.out.println(user);
	}
	
	@Test
	public void insertUser() throws IOException{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactoty("sqlMapConfig.xml").openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setUsername("zhangsan");
		user.setBirthday(new Date());
		user.setAddress("sadfsafsafs");
		user.setSex("男");
		int i = userMapper.insertUser(user);
		System.out.println(i);
	}
}
