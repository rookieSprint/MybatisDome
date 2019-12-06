package com.dyl.mybatis.mapper;

import com.dyl.mybatis.pojo.User;

public interface UserMapper {

	User findUserById(int i);
	int  insertUser(User user);
}
