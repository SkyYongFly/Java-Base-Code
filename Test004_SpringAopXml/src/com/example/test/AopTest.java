package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dao.PersonDao;

public class AopTest {
	@Test
	public void testSpringAop(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao) context.getBean("personDao");
		personDao.updatePerson();
	}
	
}
