package com.dyl.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dyl.mapper.UserMapper;
import com.dyl.pojo.User;

import org.junit.Before;
import org.junit.Test;

public class UserMapperTest {

	private ApplicationContext applicationContext;
	
	@Before
	public void init(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	@Test
	public void findUserById(){
		UserMapper userMapper = applicationContext.getBean(UserMapper.class);
		User user = userMapper.findUserById(25) ;
		System.out.println(user);
	}
}
