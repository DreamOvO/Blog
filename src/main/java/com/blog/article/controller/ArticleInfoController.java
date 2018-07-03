package com.blog.article.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.article.service.ArticleInfoService;

@Controller
@RequestMapping("/article")
public class ArticleInfoController {

	@Resource
	private ArticleInfoService articleInfoService;
	
	@ResponseBody
	@RequestMapping("/Info/signle")
	public Map<String,Object> queryArticleInfo(){
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("rspType", "SUCESS");
		result.put("resBody", articleInfoService.getUserById(1));
		return result;
	}
	
	@ResponseBody
	@RequestMapping("/Info/all")
	public Map<String,Object> queryArticleInfoAll(){
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("rspType", "SUCESS");
		result.put("resBody", articleInfoService.queryArticleAll());
		return result;
	}
}
