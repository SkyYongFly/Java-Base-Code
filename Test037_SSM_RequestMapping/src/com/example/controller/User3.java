package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 测试 @SessionAttributes注解
 * 
 * @author zhu
 */
@Controller
@RequestMapping("/user")
public class User3 {
	
	@ModelAttribute(value="name")
	public String userModel(@RequestParam("username") String username){
		return "1111";
	}
	
	@RequestMapping("/login3")
	public String  login(){
		return "modelatt";
	}
}
