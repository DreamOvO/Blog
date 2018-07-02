package com.blog.login.service;

import java.util.Map;

import com.blog.login.projo.User;

public interface UserLoginService {
	public User getUserById(int userId);
	public Map<String,Object> selectByUserName(Map<String,Object> params);
}
