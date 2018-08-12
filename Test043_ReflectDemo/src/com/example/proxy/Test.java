package com.example.proxy;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		Work worker = new Worker();
		worker.eat();
		worker.work();
		
		System.out.println("----------------------");
		
		//��̬����
		MyInvocationHandler handler = new MyInvocationHandler(worker);
		//��ȡ��̬�������ע���ǽӿ�
		Work worker2 = (Work) Proxy.newProxyInstance(
							worker.getClass().getClassLoader(), 
							worker.getClass().getInterfaces(), 
							handler);
		//��̬�������ִ�з���
		worker2.work();
		
		System.out.println("----------------------");
		
		String reString  = worker2.play("������");
		System.out.println("\nִ�н����" + reString);
	}
}
