package com.example.sky.junit;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.sky.mappers.UserMapper;

/**
 * 测试类
 * 
 * @author sky
 */
public class JunitTest {
	@Test
	public void testGetUserMapper() throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		UserMapper userMapper = context.getBean(UserMapper.class);
		System.out.println("用户名称：" + userMapper.getUserById(1).getName());
		
		((AbstractApplicationContext) context).close();
	}
}
