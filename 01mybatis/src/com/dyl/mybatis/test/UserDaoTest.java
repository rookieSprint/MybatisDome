package com.dyl.mybatis.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.dyl.mybatis.dao.UserDao;
import com.dyl.mybatis.dao.Impl.UserDaoImpl;

public class UserDaoTest {

	UserDao userDao = new UserDaoImpl();
	@Test
	public void getUserById(){
		System.out.println(userDao.getUserById(1));
	}
	
}
