package com.blog.login.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.login.dao.UserMapper;
import com.blog.login.projo.User;
import com.blog.login.service.UserLoginService;

@Service("userLoginService")
public class UserLoginServiceImpl implements UserLoginService {
	@Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
