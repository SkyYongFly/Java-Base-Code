package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.daomain.HelloWorld;

public class TestSpring {
	@Test
	public void testFactory(){
		//启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//根据id取出工厂类
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloStaticFactory");
		helloWorld.hello();
	}
	
	@Test
	public void testFactory2(){
		//启动spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//根据id取出工厂类
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld2");
		helloWorld.hello();
	}
}
