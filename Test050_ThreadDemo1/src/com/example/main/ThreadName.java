package com.example.main;

/**
 * 显式设置线程名称
 * @author zhu
 */
public class ThreadName {
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		//设置线程名称
		myThread2.setName("BlueSky");
		
		myThread2.start();
	}
}

class MyThread2 extends Thread{
	@Override
	public void run() {
		//输出线程的名称
		System.out.println("线程名称：" + Thread.currentThread().getName());
	}
}