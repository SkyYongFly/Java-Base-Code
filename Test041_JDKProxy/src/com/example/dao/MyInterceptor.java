package com.example.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ������
 *    1��Ŀ���ർ�����
 *    2�����������
 *    3��invoke���
 *        1����������
 *        2������Ŀ�����ķ���
 *        3��������ύ
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
