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
	 * 结果：
	 * 		true
	 *		我用  com.example.bean.Phone@646be2c3 手机发送短信
	 *		我用  com.example.bean.Phone@797badd3 手机发送短信
	 *
	 * 多实例的Bean如果是通过注入的方式传入到其他bean中，每次其他Bean使用的时候其实还是同一个bean，也就是没起到
	 * 多实例的属性作用，所以这种情况下其他bean需要用 lookup方法来获取多实例bean,方法的具体实现在配置文件中指定，即
	 * 指定方法获取的是哪一个bean，因为指向的是多实例bean，每次获取也就重新获取一个新的bean，就不会每次获取的都是同一
	 * 个bean了
	 */
	@Test
	public void testAlias(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person person1 = context.getBean("person",Person.class);
		Person person2 = context.getBean("person",Person.class);
		
		System.out.println(person1 == person2);
		
		person1.sendMessage();
		person2.sendMessage();
	}
	
}
