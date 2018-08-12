package com.example.proxy;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		Work worker = new Worker();
		worker.eat();
		worker.work();
		
		System.out.println("----------------------");
		
		//动态代理
		MyInvocationHandler handler = new MyInvocationHandler(worker);
		//获取动态代理对象，注意是接口
		Work worker2 = (Work) Proxy.newProxyInstance(
							worker.getClass().getClassLoader(), 
							worker.getClass().getInterfaces(), 
							handler);
		//动态代理对象执行方法
		worker2.work();
		
		System.out.println("----------------------");
		
		String reString  = worker2.play("打篮球");
		System.out.println("\n执行结果：" + reString);
	}
}
