package com.example.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 利用注解方式配置Controller类
 * 处理前端 hello请求
 */
@Controller
public class HelloController{

    private static  final Log logger = LogFactory.getLog(HelloController.class);

    @RequestMapping(value = "/hello")
    public ModelAndView  hello(){
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
