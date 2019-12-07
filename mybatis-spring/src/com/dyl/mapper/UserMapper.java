package com.dyl.mapper;

import java.util.List;

import com.dyl.pojo.QueryVo;
import com.dyl.pojo.User;

public interface UserMapper {

	User findUserById(int i);
	List<User> queryUserByQueryVo(QueryVo queryVo);
	List<User> queryUserWhere(User user);
	List<User> findUserByids(QueryVo queryVo);
	List<User> queryUserOrder();
}
