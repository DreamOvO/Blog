package com.blog.login.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.login.projo.User;
import com.blog.login.service.UserLoginService;



@Controller
@RequestMapping("/user")
public class UserLoginController {
	@Resource
    private UserLoginService userLoginService;
	 @RequestMapping("/User{id}")
	    @ResponseBody
	      public User user(@PathVariable int id, Model model) {
	         // int userId = Integer.parseInt(request.getParameter("id"));
	    	User user = this.userLoginService.getUserById(id);
	          return user;
	      }
}
