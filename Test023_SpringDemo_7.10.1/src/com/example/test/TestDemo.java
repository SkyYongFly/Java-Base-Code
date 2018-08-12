/**
 * 
 */
package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Phone;

/**
 * @author 	:zhuyong
 */
public class TestDemo {
	/**
	 * 测试bean属性定义成bean
	 * 
	 * 结果：
	 * 		用Meizu手机发送短信
	 * 
	 * phone并不是直接在配置文件中定义的具体类，而是利用person 中的phone属性 定义的一个Bean
	 */
	@Test
	public void testGetOtherBeanAttribute(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Phone phone = context.getBean("phone",Phone.class);
		phone.sendMessage();
	}
	
	/**
	 * 测试bean属性值定义成另一个bean的属性值
	 * 
	 * 结果：
	 * 		用Meizu手机发送短信
	 */
	@Test
	public void testAttributeAsOtherBeanAttributeValue(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Phone phone2 = context.getBean("phone2",Phone.class);
		phone2.sendMessage();
	}
}
