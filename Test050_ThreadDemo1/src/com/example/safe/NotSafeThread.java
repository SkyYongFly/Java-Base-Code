package com.example.safe;

/**
 * 线程不安全的例子
 * @author zhu
 */
public class NotSafeThread {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		Thread thread1 = new Thread(myThread);
		Thread thread2 = new Thread(myThread);
		Thread thread3 = new Thread(myThread);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyThread implements Runnable{
	private int num = 0;
	
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++){
			num++;
		}
		System.out.println(Thread.currentThread().getName() + "_num的值：" + num);
	}
}

