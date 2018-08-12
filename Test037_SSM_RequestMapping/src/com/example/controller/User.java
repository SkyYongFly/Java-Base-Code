package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class User {

	@RequestMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		System.out.println("登录用户：" + username);
		System.out.println("登录密码：" + password);
		
		model.addAttribute("message", "登录成功！");
		return "welcome";
	}
	
	@RequestMapping(value="/getUserInfo/{userId}")
	public String  getUserInfo(@PathVariable String userId){
		System.out.println("用户ID：" + userId);
		
		return "welcome";
	}
	
	@RequestMapping(value="/header")
	public String  getHeader(@RequestHeader("User-Agent")String agent, @RequestHeader("Accept")String[] accepts){
		System.out.println("userAgent  : " + agent + "\n");
		
		for(String accept : accepts){
			System.out.println(accept);
		}
		
		return "welcome";
	}
	
	@RequestMapping(value="/cookie")
	public String  getSessionId(@CookieValue(value = "JSESSIONID", defaultValue="")String sessionId){
		System.out.println("sessionId : " + sessionId);
		
		return "welcome";
	}

}
