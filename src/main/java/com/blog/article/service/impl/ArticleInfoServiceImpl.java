package com.blog.article.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.article.dao.ArticleMapper;
import com.blog.article.projo.Article;
import com.blog.article.service.ArticleInfoService;

@Service("articleInfoServiceImpl")
public class ArticleInfoServiceImpl implements ArticleInfoService {

	@Resource
	private ArticleMapper articleMapper;
	
	 public Article getUserById(int id) {
	        return this.articleMapper.selectByPrimaryKey(id);
	    }
	 
	 public List<Map<String,Object>> queryArticleAll(){
		 return this.articleMapper.selectByall();
	 }
}
