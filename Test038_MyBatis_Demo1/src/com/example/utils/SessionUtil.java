package com.example.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis session 管理工具类
 * 
 * @author zhu
 */
public class SessionUtil {
	//定义锁
	private static Class<SessionUtil> LOCK = SessionUtil.class;
	
	private static SqlSessionFactory sqlSessionFactory ;
	
	/**
	 * 创建SqlSessionFactory
	 * 
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory(){
		//加锁，防止并发频繁创建对象
		synchronized(LOCK){	
			if(null != sqlSessionFactory){
				return sqlSessionFactory;
			}
			
			try {
				String configFile = "mybatis-config.xml";
				InputStream inputStream = Resources.getResourceAsStream(configFile);
				
				SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
				sqlSessionFactory =  sqlSessionFactoryBuilder.build(inputStream);
				
				return sqlSessionFactory;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
	
	/**
	 * 获取SqlSession
	 * 
	 * @return
	 */
	public static SqlSession getSqlSession(){
		if(null == sqlSessionFactory){
			getSqlSessionFactory();
		}
		
		return sqlSessionFactory.openSession();
	}
}
