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
	 * ����ֱ�ӻ�ȡ���Ա���������beanֵ
	 */
	@Test
	public void testBean(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		System.out.println("theAge��ֵ" + context.getBean("theAge"));
		System.out.println("theAge��ֵ" + context.getBean("theAge2"));
	}
	
	/**
	 * ����ֱ�ӻ�ȡ�ĳ�Ա����ֵע�뵽����bean
	 */
	@Test
	public void testPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person = context.getBean("person",Person.class);
		person.print();
	}
}
