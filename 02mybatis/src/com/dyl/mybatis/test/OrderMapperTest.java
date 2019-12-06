package com.dyl.mybatis.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.dyl.mybatis.mapper.OrderMapper;
import com.dyl.mybatis.pojo.Order;
import com.dyl.mybatis.untils.MybatisUtil;

public class OrderMapperTest {

	@Test
	public void queryOrderUserResultMap() throws IOException{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactoty("sqlMapConfig.xml").openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<Order> orders = orderMapper.queryOrderUserResultMap();
		for (Order order : orders) {
			System.out.println(order);
			System.out.println("用户user：  " + order.getUser());
		}
	}
	
	
	
	@Test
	public void findOrderAll() throws IOException{
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactoty("sqlMapConfig.xml").openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<Order> orders = orderMapper.findOrderAll();
		for (Order order : orders) {
			System.out.println(order);
		}
	}
}
