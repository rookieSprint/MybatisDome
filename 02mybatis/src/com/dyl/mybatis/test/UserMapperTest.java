package com.dyl.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dyl.mybatis.mapper.UserMapper;
import com.dyl.mybatis.pojo.QueryVo;
import com.dyl.mybatis.pojo.User;
import com.dyl.mybatis.untils.MybatisUtil;

public class UserMapperTest {

	
	
	@Test
	public void findUserByids() throws IOException{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactoty("sqlMapConfig.xml").openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(10);
		ids.add(25);
		QueryVo queryVo = new QueryVo();
		queryVo.setIds(ids);
		List<User> users = userMapper.findUserByids(queryVo);
		for (User user : users) {
			System.out.println(user);
		}
		sqlSession.close();
	}
	
	
	
	
	@Test
	public void queryUserWhere() throws IOException{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactoty("sqlMapConfig.xml").openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setSex("1");
		user.setUsername("张");
		List<User> users = userMapper.queryUserWhere(user);
		for (User user2 : users) {
			System.out.println(user2);
		}
	}
	
	
	
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
	public void queryUserByQueryVo() throws IOException{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactoty("sqlMapConfig.xml").openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setUsername("张");
		QueryVo queryVo = new QueryVo();
		queryVo.setUser(user);
		List<User> users = userMapper.queryUserByQueryVo(queryVo);
		for (User user2 : users) {
			System.err.println(user2);
		}
		sqlSession.close();
	}
	
}
