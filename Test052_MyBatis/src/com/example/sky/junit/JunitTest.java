package com.example.sky.junit;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.example.sky.mappers.UserMapper;
import com.example.sky.pojo.User;
import com.example.sky.utils.SqlSessionUtil;

/**
 * 测试类
 * 
 * @author sky
 */
public class JunitTest {
	@Test
	public void testGetUserMapper() throws IOException {
		SqlSession session = SqlSessionUtil.getSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = userMapper.getUserById(2);
		System.out.println("用户名：" + user.getName());
		session.close();
	}
	
	@Test
	public void testAddUser() throws ParseException {
		SqlSession session = SqlSessionUtil.getSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date birth = dateFormat.parse("1998-01-01");
		User user = new User(3, "李四", "中国", 20, birth);
		
		try {
			userMapper.addUser(user);
			session.commit();
		}catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			if(null != session) {
				session.close();	
			}
		}
	}
}
