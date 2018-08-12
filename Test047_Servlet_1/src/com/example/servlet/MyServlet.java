package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * 自定义Servlet，实现Servlet接口
 * 
 * @author zhuyong
 */
@WebServlet(name="MyServlet",urlPatterns="/myServlet")
public class MyServlet implements Servlet{
	//Servlet配置信息对象
	private ServletConfig servletConfig = null;

	/**
	 * 初始化方法，第一次请求时调用
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
		
		System.out.println("MyServlet 被初始化了...");
	}

	/**
	 * 核心逻辑方法，每次请求都调用
	 */
	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		servletResponse.setCharacterEncoding("UTF-8");
		servletResponse.setContentType("text/html");
		
		PrintWriter printWriter = servletResponse.getWriter();
		printWriter.write("<html><head></head><body>Hello ,This Is MyServlet!</body></html>");
		
		printWriter.close();
	}
	
	/**
	 * 销毁方法
	 */
	@Override
	public void destroy() {
		System.out.println("MyServlt被销毁了...");
	}

	/**
	 * 获取ServletConfig方法
	 */
	@Override
	public ServletConfig getServletConfig() {
		return servletConfig;
	}

	/**
	 * 获取Servlet的基本描述
	 */
	@Override
	public String getServletInfo() {
		return "This is MyServlet!";
	}
}
