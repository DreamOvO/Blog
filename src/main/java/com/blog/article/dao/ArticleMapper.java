package com.blog.article.dao;

import java.util.List;
import java.util.Map;

import com.blog.article.projo.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
    
    List<Map<String,Object>> selectByall();
}