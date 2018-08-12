package com.example.sky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.sky.mappers.UserMapper;
import com.example.sky.pojo.User;

/**
 * 用户相关请求处理逻辑类
 * 
 * @author sky
 */
@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 获取所有的用户
	 * 
	 * @return
	 */
	@RequestMapping(value = "/user/getAllUsers.action")
	public ModelAndView getAllUsers(ModelAndView modelAndView)  throws Exception {
		List<User> userList = userMapper.getAllUsers();
		
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("showuser");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/user/getUserInfoJSON.action", method=RequestMethod.POST)
	public @ResponseBody User getUserInfo(@RequestBody User user){
		//模拟设置一个用户
		User responseUser = new User();
		responseUser.setName(user.getName());
		responseUser.setAddress("china");
		
		return responseUser;
	}
}
