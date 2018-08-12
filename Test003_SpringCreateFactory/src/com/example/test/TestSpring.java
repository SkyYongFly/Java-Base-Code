package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.daomain.HelloWorld;

public class TestSpring {
	@Test
	public void testFactory(){
		//����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//����idȡ��������
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloStaticFactory");
		helloWorld.hello();
	}
	
	@Test
	public void testFactory2(){
		//����spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//����idȡ��������
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld2");
		helloWorld.hello();
	}
}
