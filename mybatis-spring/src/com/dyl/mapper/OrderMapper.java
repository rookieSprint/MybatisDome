package com.dyl.mapper;

import java.util.List;

import com.dyl.pojo.Order;

public interface OrderMapper {

	List<Order> findOrderAll();
	List<Order> queryOrderUserResultMap();
}
