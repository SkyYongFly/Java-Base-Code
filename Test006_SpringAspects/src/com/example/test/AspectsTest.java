package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectsTest {
	@Test
	public void testAspects(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao) context.getBean("personDao");
		personDao.getPerson();
	}

}
