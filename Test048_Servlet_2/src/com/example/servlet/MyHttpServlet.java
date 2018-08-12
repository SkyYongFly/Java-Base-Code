package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 继承HttpServlet定义一个Servlet
 * 
 * @author zhuyong
 */
@WebServlet(urlPatterns="/myHttpServlet")
public class MyHttpServlet extends HttpServlet{
	private static final long serialVersionUID = 927677281600473562L;

	@Override
	public void init() throws ServletException {
		super.init();
		
		System.out.println("MyHttpServlet被初始化了...");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = resp.getWriter();
		writer.write("<html><head></head><body>Hello ,This Is MyHttpServlet!</br>"
				+ "Impossible Is Nothing!</body></html>");
		
		writer.close();
	}
}
