package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC 控制器 
 * 
 * @author zhu
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	/**
	 * 处理用户注册请求
	 * @return
	 */
	@RequestMapping(value = "/register")
	public String register(Model model){
		model.addAttribute("message", "注册成功！");
		return "welcome";
	}
	
	/**
	 * 用户登录
	 * @return
	 */
	@RequestMapping("/login")
	public String login(Model model){
		model.addAttribute("message", "登录成功！");
		return "welcome";
	}
}
