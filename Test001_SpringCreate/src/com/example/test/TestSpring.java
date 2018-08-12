package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.daomain.HelloWorld;

public class TestSpring {
	@Test
	public void testCreateClass(){
		//����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//����id��spring�����е�beanȡ����
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.hello();
	}
	
	@Test
	public void testLazyCreateClass(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("lazyHelloWorld");
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("lazyHelloWorld");
		System.out.println(helloWorld);
		System.out.println(helloWorld2);
	}
}
