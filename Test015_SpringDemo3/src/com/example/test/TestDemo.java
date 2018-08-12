package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Person;
import com.example.beanimpl.Chinese;

public class TestDemo {
	/**
	 * 测试嵌套bean
	 */
	@Test
	public void testChinese(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person chinese = context.getBean("chinese",Chinese.class);
		chinese.usePhone();
		
		//嵌套式Bean获取不到对应的bean
//		Phone wiun = context.getBean("winphone",Phone.class);
//		wiun.sendMessage();
		
		Person xiaoliu = context.getBean("xiaoliu",Chinese.class);
		xiaoliu.usePhone();
	}
	
	/**
	 * 测试打印所有的成员变量
	 */
	@Test
	public void testAttr(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Chinese tuhao = context.getBean("tuhao",Chinese.class);
		tuhao.test();
	}
	
	/**
	 * 测试组合属性
	 */
	@Test
	public void testComAttr(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Chinese hong = context.getBean("xiaohong",Chinese.class);
		//hong.getPhone().sendMessage();
		hong.usePhone();
	}
	
	

}
