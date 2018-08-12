package com.example.method;

/**
 * �߳����ȼ�
 * @author zhu
 */
public class ThreadPriority {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		Thread thread1 = new Thread(myThread,"�ϴ�");
		Thread thread2 = new Thread(myThread,"С��1");
		Thread thread3 = new Thread(myThread,"С��2");
		
		//��ֵԽ�����ȼ�Խ��
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
