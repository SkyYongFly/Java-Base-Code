package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.beanimpl.AndroidPhone;
import com.example.beanimpl.WinPhone;

public class TestDemo {
	@Test
	public void testStaticFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		WinPhone winPhone = context.getBean("winphone",WinPhone.class);
		winPhone.sendMessage();
	}
	
	@Test
	public void testInstFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		AndroidPhone androidphone = context.getBean("androidphone",AndroidPhone.class);
		androidphone.sendMessage();
	}
}
