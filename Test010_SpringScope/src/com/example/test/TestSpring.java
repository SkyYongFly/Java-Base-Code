package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.daomain.HelloWorld;

public class TestSpring {
	@Test
	public void testScope(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("scopeHelloWorld");
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("scopeHelloWorld");
		System.out.println(helloWorld);
		System.out.println(helloWorld2);
	}
}
