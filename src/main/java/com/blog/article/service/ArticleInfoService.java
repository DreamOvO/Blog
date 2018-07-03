package com.blog.article.service;

import java.util.List;
import java.util.Map;

import com.blog.article.projo.Article;

public interface ArticleInfoService {

	public Article getUserById(int id);
	
	public List<Map<String,Object>> queryArticleAll();
}
