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
	public void testSetBeanProperty(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Phone phone = context.getBean("phone",Phone.class);
		phone.sendMessage();
	}
	
	
	
	@Test
	public void testPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = context.getBean("person",Person.class);
		person.sendMessage();
	}
}
