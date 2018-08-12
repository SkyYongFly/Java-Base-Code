package com.example.main;

/**
 * 线程实现的方式二：实现Runnable接口
 * @author zhu
 */
public class ThreadMethod2 {
	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		
		//这是错误的，因为方式二并不是继承Thread类，并没有start方法
		//myThread3.start();
		
		Thread thread = new Thread(myThread3);
		Thread thread2 = new Thread(myThread3);
		
		thread.start();
		thread2.start();
	}
}

//实现Runnable接口
class MyThread3 implements Runnable{
	@Override
	public void run() {
		System.out.println("线程名称：" + Thread.currentThread().getName());
	}
	
}
