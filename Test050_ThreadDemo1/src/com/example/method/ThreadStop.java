package com.example.method;

/**
 * Ïß³ÌÍ£Ö¹£ºThread.stop()
 * @author zhu
 */
public class ThreadStop {
	public static void main(String[] args) throws InterruptedException {
		MyThread3 myThread = new MyThread3();
		
		Thread thread1 = new Thread(myThread);
		thread1.start();
		thread1.sleep(5);
		thread1.stop();
	}
}

class MyThread3 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 500 ; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
