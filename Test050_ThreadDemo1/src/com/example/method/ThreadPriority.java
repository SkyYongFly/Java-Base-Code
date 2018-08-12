package com.example.method;

/**
 * 线程优先级
 * @author zhu
 */
public class ThreadPriority {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		Thread thread1 = new Thread(myThread,"老大");
		Thread thread2 = new Thread(myThread,"小弟1");
		Thread thread3 = new Thread(myThread,"小弟2");
		
		//数值越大，优先级越高
		thread1.setPriority(10);
		thread2.setPriority(5);
		thread3.setPriority(6);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0 ; i < 300 ; i++){
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
