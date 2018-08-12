package com.example.sky.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis 数据源连接公共基础类，包括数据源连接工程、获取数据源等功能
 * 
 * @author sky
 */
public class SqlSessionUtil {
	//数据源连接工厂
	private static SqlSessionFactory sessionFactory = null;
	
	static {
		if(null == sessionFactory) {
			try {
				//获取配置文件
				String resource = "mybatis-config.xml";
				//读取配置
				InputStream  inputStream = Resources.getResourceAsStream(resource);
				//创建Session工厂
				sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 获取数据源连接对象
	 * 
	 * @return
	 */
	public static SqlSession	getSqlSession() {
		return sessionFactory.openSession();
	}
}
