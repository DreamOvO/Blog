package com.blog.login.service.impl;

import java.util.HashMap;
import java.util.Map;

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
    
    public Map<String,Object> selectByUserName(Map<String,Object> params){ 
    	Map<String, Object> result =new HashMap<String,Object>();
    	Map<String, Object> map=userMapper.selectByUserName(params.get("userName").toString());
    	if(map.get("password").equals(params.get("passWord")))
    		result.put("rspType", "SUCESS");
    	else {
    		result.put("rspType", "FAIL");
    		result.put("message", "密码错误");
    	}
    	return result;
    	
    }
}
