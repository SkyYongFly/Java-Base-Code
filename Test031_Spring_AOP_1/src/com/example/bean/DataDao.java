package com.example.bean;

import org.springframework.stereotype.Repository;

/**
 * 测试dao层类
 * 
 * @author zhu
 */
@Repository
public class DataDao implements Dao{

	@Override
	public void insertData(Object object) {
		System.out.println("dao层插入数据:" + object);
//		throw new RuntimeException();
	}

	@Override
	public Object getData() {
		System.out.println("dao层获取到数据");
		return "haha";
	}
	
}
