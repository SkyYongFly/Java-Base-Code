package com.example.sky.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.sky.mappers.UserMapper;
import com.example.sky.pojo.User;

/**
 * 测试类
 * 
 * @author sky
 */
public class JunitTest {
	/**
	 * 测试查询用户信息
	 */
	@Test
	public void testQueryUsers() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = context.getBean(UserMapper.class);
		
		User user =  userMapper.getUserById(1);
		System.out.println("\n" + user.toString());
	}
	
}
