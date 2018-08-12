package com.example.method;

/**
 * 线程暂停：Thread.yield()
 * @author zhu
 */
public class ThreadYield {
	public static void main(String[] args) {
		MyThread5 myThread = new MyThread5();
		
		Thread thread1 = new Thread(myThread,"基友1");
		Thread thread2 = new Thread(myThread,"基友2");
		Thread thread3 = new Thread(myThread,"基友3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyThread5 implements Runnable{
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(Thread.currentThread().getName() + ":" + i);
			//我先暂停一下
			Thread.yield();
		}
	}
}
