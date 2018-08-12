package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.ExampleBean;

public class TestDemo {
	@Test
	public void testInitAndDestory(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		ExampleBean exampleBean = context.getBean("exampleBean",ExampleBean.class);
		
		context.close();
	}
}
