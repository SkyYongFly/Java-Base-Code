package com.example.bean;

import org.springframework.stereotype.Repository;

/**
 * ����dao����
 * 
 * @author zhu
 */
@Repository
public class DataDao implements Dao{

	@Override
	public void insertData(Object object) {
		System.out.println("dao���������:" + object);
//		throw new RuntimeException();
	}

	@Override
	public Object getData() {
		System.out.println("dao���ȡ������");
		return "haha";
	}
	
}
