package com.dyl.mybatis.mapper;

import java.util.List;

import com.dyl.mybatis.pojo.Order;

public interface OrderMapper {

	List<Order> findOrderAll();
	List<Order> queryOrderUserResultMap();
}
