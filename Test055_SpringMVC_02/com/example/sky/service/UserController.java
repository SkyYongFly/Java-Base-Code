package com.example.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.sky.mappers.UserMapper;
import com.example.sky.pojo.User;

/**
 * 用户相关请求处理逻辑类
 * 
 * @author sky
 */
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 获取所有的用户
	 * 
	 * @return
	 */
	@RequestMapping("/getAllUsers")
	public ModelAndView getAllUsers(ModelAndView modelAndView){
		List<User> userList = userMapper.getAllUsers();
		
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("showuser");
		
		return modelAndView;
	}
}
