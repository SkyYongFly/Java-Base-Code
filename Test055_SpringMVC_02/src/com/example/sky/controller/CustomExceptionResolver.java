package com.example.sky.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.example.sky.exception.CustomException;

/**
 * 自定义全局异常处理器
 * <p>
 * 	系统抛出异常统一由该处理器处理 <br/>
 * 	判断抛出异常类型<br/>
 * 	1、如果为CustomException，则跳转到提示信息页面<br/>
 * 	2、如果不是则重新自定义异常
 * </p> 
 * @author zhuyong
 */
@Component
public class CustomExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, 
			HttpServletResponse response, Object handler, Exception exception) {
		//输出异常信息
		exception.printStackTrace();
		
		//判断获取异常信息
		CustomException customException = null;
		if(exception instanceof CustomException) {
			customException = (CustomException) exception;
		}else {
			customException = new CustomException("操作产生错误，请与管理员联系！");
		}
		
		//设置返回视图
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("errormsg", customException.getMessage());
		modelAndView.setViewName("error");
		
		return modelAndView;
	}
}
