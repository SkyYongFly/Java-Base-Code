package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.daomain.HelloWorld;

public class TestSpring {
	@Test
	public void testScope(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.hello();
		
		ClassPathXmlApplicationContext context2 = (ClassPathXmlApplicationContext) context;
		//springÈÝÆ÷¹Ø±Õ
		context2.close();
	}
}
