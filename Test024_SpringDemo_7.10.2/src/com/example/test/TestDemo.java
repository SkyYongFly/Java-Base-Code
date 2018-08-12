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
	 * 测试直接获取类成员变量定义的bean值
	 */
	@Test
	public void testBean(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		System.out.println("theAge的值" + context.getBean("theAge"));
		System.out.println("theAge的值" + context.getBean("theAge2"));
	}
	
	/**
	 * 测试直接获取的成员变量值注入到其他bean
	 */
	@Test
	public void testPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = context.getBean("person",Person.class);
		person.print();
	}
}
