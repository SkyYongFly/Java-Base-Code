package com.example.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {
	@Test
	public void testGetPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("persondao");
		personDao.getPerson();
	}
	
}
