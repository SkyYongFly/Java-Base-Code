package com.example.jdbc2;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersondaoTest {
	@Test
	public void testSavePerson() throws SQLException{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao) context.getBean("persondao2");
		personDao.savePerson("insert into person values('xue',22)");
	}
}
