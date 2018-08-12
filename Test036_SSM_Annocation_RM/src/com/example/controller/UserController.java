package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMVC ������ 
 * 
 * @author zhu
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	/**
	 * �����û�ע������
	 * @return
	 */
	@RequestMapping(value = "/register")
	public String register(Model model){
		model.addAttribute("message", "ע��ɹ���");
		return "welcome";
	}
	
	/**
	 * �û���¼
	 * @return
	 */
	@RequestMapping("/login")
	public String login(Model model){
		model.addAttribute("message", "��¼�ɹ���");
		return "welcome";
	}
}
