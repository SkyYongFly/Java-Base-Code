package com.example.main;

/**
 * 多线程实现方式一：继承Thread类
 * @author zhu
 */
public class ThreadMethod1 {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		
		//启动线程
		myThread1.start();
		myThread2.start();
		
		//输出main方法所在线程名称
		System.out.println("main方法所在线程名称：" + Thread.currentThread().getName());
	}
}

//继承Thread,重写run方法
//run方法中的内容就是线程运行时执行的内容
class MyThread extends Thread{
	@Override
	public void run() {
		//输出线程的名称
		System.out.println("线程名称：" + Thread.currentThread().getName());
	}
}


