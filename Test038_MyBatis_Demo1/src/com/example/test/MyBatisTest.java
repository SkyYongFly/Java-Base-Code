package com.example.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.example.mappers.UserMapper;
import com.example.pojo.User;
import com.example.utils.SessionUtil;

public class MyBatisTest {
	@Test
	public void testAddUser(){
		User user = new User();
		user.setId(1);
		user.setName("小明");
		
		SqlSession session = SessionUtil.getSqlSession();
		
		try{
			UserMapper userMapper = session.getMapper(UserMapper.class);
			userMapper.addUser(user);
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			if(null != session){
				session.close();
			}
		}
	}
	
	@Test
	public void testDeleteUser(){
		SqlSession session = SessionUtil.getSqlSession();
		try{
			UserMapper userMapper = session.getMapper(UserMapper.class);
			userMapper.deleteUser(1);
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			if(null != session){
				session.close();
			}
		}
	}
	
	@Test
	public void testUpdateUser(){
		User user = new User();
		user.setId(1);
		user.setName("小红");
		
		SqlSession session = SessionUtil.getSqlSession();
		
		try{
			UserMapper userMapper = session.getMapper(UserMapper.class);
			userMapper.updateUser(user);
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			if(null != session){
				session.close();
			}
		}
	}
	
	@Test
	public void testGetUser(){
		SqlSession session = SessionUtil.getSqlSession();
		
		try{
			UserMapper userMapper = session.getMapper(UserMapper.class);
			System.out.println(userMapper.getUser(1).toString());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(null != session){
				session.close();
			}
		}
	}
}
