package com.example.method;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �߳����ߣ�Thread.sleep()
 * @author zhu
 */
public class ThreadSleep {
	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		
		Thread thread1 = new Thread(myThread,"����1");
		Thread thread2 = new Thread(myThread,"����2");
		Thread thread3 = new Thread(myThread,"����3");
		
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
			System.out.println(Thread.currentThread().getName() + ":��ʼ" + format.format(new Date()));
			
			//����3����
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + ":����" +format.format(new Date()));
		}
	}
}
