package com.dyl.mybatis.dao.Impl;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dyl.mybatis.dao.UserDao;
import com.dyl.mybatis.pojo.User;
import com.dyl.mybatis.untils.MybatisUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUserById(int i) {
		SqlSession sqlSession = null;
		try {
			SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactoty("userSql.xml");
			sqlSession = sqlSessionFactory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		User user = sqlSession.selectOne("user.", i);
		return user;
	}

}
