package com.dyl.mybatis.mapper;

import java.util.List;

import com.dyl.mybatis.pojo.QueryVo;
import com.dyl.mybatis.pojo.User;

public interface UserMapper {

	User findUserById(int i);
	List<User> queryUserByQueryVo(QueryVo queryVo);
	List<User> queryUserWhere(User user);
	List<User> findUserByids(QueryVo queryVo);
	List<User> queryUserOrder();
}
