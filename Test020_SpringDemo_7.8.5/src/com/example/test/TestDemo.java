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
	public void testAlias(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		//我这里只获取了person的bean，但是结果打印的时候却先打印phone
		//创建的消息，因为person强制依赖了phone,即person之前先要创建phone
		Person person = context.getBean("person",Person.class);
	}
	
}
