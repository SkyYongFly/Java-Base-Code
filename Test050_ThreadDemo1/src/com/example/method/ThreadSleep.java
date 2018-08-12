package com.example.method;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程休眠：Thread.sleep()
 * @author zhu
 */
public class ThreadSleep {
	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		
		Thread thread1 = new Thread(myThread,"基友1");
		Thread thread2 = new Thread(myThread,"基友2");
		Thread thread3 = new Thread(myThread,"基友3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyThread2 implements Runnable{
	@Override
	public void run() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(Thread.currentThread().getName() + ":开始" + format.format(new Date()));
			
			//休眠3秒钟
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + ":结束" +format.format(new Date()));
		}
	}
}
