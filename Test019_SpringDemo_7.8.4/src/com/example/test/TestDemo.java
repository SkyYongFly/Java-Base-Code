/**
 * 
 */
package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Person;

/**
 * @author 	:zhuyong
 */
public class TestDemo {
	/**
	 * 测试获取bean的id
	 */
	@Test
	public void testGetBeanId(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = context.getBean("person",Person.class);
		person.info();
	}
}
