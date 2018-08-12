package com.jsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 请求处理控制器
 * 
 * @author sky
 */
@Controller
public class HelloController {
	/**
	 * 处理Hello请求
	 * 
	 * @return ModelAndView
	 */
	/**
	@RequestMapping(value="/request/hello.action")
	public ModelAndView getHelloContent() {
		ModelAndView modelAndView = new ModelAndView();
		
		//设置模型数据
		modelAndView.addObject("content", "Hello , Welcome SpringMVC World!");
		//设置返回视图
		modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
		
		return modelAndView;
	}
	 */
	
	/**
	 * 处理Hello请求(利用视图解释器，返回视图只需要定义JSP页面名称)
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value="/request/hello2.action")
	public ModelAndView getHelloContent2() {
		ModelAndView modelAndView = new ModelAndView();
		
		//设置模型数据
		modelAndView.addObject("content", "Hello , Welcome SpringMVC World!");
		//设置返回视图
		modelAndView.setViewName("welcome");
		
		return modelAndView;
	}
}
