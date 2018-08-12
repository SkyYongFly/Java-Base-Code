package com.example.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 拦截器
 *    1、目标类导入进来
 *    2、事务导入进来
 *    3、invoke完成
 *        1、开启事务
 *        2、调用目标对象的方法
 *        3、事务的提交
 *
 */
public class MyInterceptor implements InvocationHandler{
	private PersonDao personDao;
	private Transaction transaction;
	
	public MyInterceptor(PersonDao personDao,Transaction transaction){
		super();
		this.personDao = personDao;
		this.transaction = transaction;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		if("updatePerson".equals(methodName)){
			transaction.beginTransaction();
			method.invoke(personDao);
			transaction.commint();
		}else{
			method.invoke(personDao);
		}
		
		return null;
	}

}
