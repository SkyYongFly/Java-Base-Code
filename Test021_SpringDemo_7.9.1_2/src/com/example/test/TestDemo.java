/**
 * 
 */
package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Phone;

/**
 * @author 	:zhuyong
 */
public class TestDemo {
	/**
	 * 测试初始化方法
	 * 
	 * 实现InitializingBean接口方法  比  在配置文件中指定初始化方法要先执行
	 * 
	 * 程序执行次序    ： 构造方法——设置属性方法——初始化方法（两种都定义的话，实现结构的方法先执行）——bean对象调用的方法
	 */
	@Test
	public void testInitMethod(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Phone phone = context.getBean("phone",Phone.class);
		phone.sendMessage();
	}
	
	/**
	 * 测试销毁bean之前执行的方法
	 * 
	 * 如果两种方法都有，实现DisposableBean接口的方法优于 ， 配置文件指定的方法先执行
	 */
	@Test
	public void testCloseMethod(){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Phone phone = context.getBean("phone",Phone.class);
		phone.sendMessage();
		
		//为Spring容器注册关闭钩子，即程序在退出JVM之前关闭Spring容器
		context.registerShutdownHook();
	}
	
}
