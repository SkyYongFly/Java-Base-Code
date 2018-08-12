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
	/**
	 * 测试别名
	 */
	@Test
	public void testAlias(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		//利用别名获取bean对象
//		Person person = context.getBean("ren",Person.class);
		Person person = context.getBean("zgr",Person.class);
		person.sendMessage();
	}
	
	/**
	 * 测试作用域
	 */
	@Test
	public void testScope(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		//没有设置作用域，则默认为单例模式，所有bean只引用同一个实例
		System.out.println(context.getBean("phone",Phone.class) == context.getBean("phone",Phone.class));
		//单例模式
		System.out.println(context.getBean("winphone",Phone.class) == context.getBean("winphone",Phone.class));
		//
		System.out.println(context.getBean("earthperson",Person.class) == context.getBean("earthperson",Person.class));
	}
}
