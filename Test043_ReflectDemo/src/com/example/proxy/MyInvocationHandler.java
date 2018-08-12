package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
	private Object proxyInstance;
	
	public MyInvocationHandler(Object prObject) {
		this.proxyInstance = prObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ִ��֮ǰȨ�޼��");
		Object result = method.invoke(proxyInstance, args);
		System.out.println("ִ��֮����־��¼");
		
		return result; //���ط���ִ�еĽ��
	}

}
