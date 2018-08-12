package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.bean.User;

/**
 * 测试 @SessionAttributes注解
 * 
 * @author zhu
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class User2 {
	
	@RequestMapping("/login2")
	public String  login(@RequestParam("username")String username, @RequestParam("password")String password, Model model){
		User  user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		model.addAttribute(user);
		
		return "sessionatt";
	}

}
