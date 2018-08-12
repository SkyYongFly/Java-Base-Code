/**
 * 
 */
package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Person;
import com.example.bean.Phone;

/**
 * @author 	:zhuyong
 */
public class TestDemo {
	@Test
	public void testPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = context.getBean("person",Person.class);
		person.sendMessage();
		person.print();
	}
	
	@Test
	public void testPerson2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = context.getBean("person2",Person.class);
		person.sendMessage();
		person.print();
	}
	
	@Test
	public void testPerson3(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = context.getBean("person3",Person.class);
		person.sendMessage();
		person.print();
	}
}
