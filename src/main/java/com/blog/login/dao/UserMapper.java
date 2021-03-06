package com.blog.login.dao;

import java.util.Map;

import com.blog.login.projo.User;


public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    Map<String,Object> selectByUserName(String userName);
}