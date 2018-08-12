package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.daomain.Person;
import com.example.service.PersonService;

public class Test {
	@org.junit.Test
	public void testPersonDao(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = new Person();
		person.setName("wen");
		person.setAge(12);
		
		PersonService service = (PersonService) context.getBean("personService");
		service.savePerson(person);
	}
}
