package com.example.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 处理前端 hello请求
 */
public class HelloController  implements Controller{

    private static  final Log logger = LogFactory.getLog(HelloController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handle被调用");

        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据
        modelAndView.addObject("message","Hello World");
        //设置显示的逻辑视图名
        modelAndView.setViewName("/WEB-INF/content/welcome.jsp");

        return  modelAndView;
    }
}
