package com.example.main;

/**
 * ��ʽ�����߳�����
 * @author zhu
 */
public class ThreadName {
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		//�����߳�����
		myThread2.setName("BlueSky");
		
		myThread2.start();
	}
}

class MyThread2 extends Thread{
	@Override
	public void run() {
		//����̵߳�����
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName());
	}
}