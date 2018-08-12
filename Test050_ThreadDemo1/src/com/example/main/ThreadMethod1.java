package com.example.main;

/**
 * ���߳�ʵ�ַ�ʽһ���̳�Thread��
 * @author zhu
 */
public class ThreadMethod1 {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		
		//�����߳�
		myThread1.start();
		myThread2.start();
		
		//���main���������߳�����
		System.out.println("main���������߳����ƣ�" + Thread.currentThread().getName());
	}
}

//�̳�Thread,��дrun����
//run�����е����ݾ����߳�����ʱִ�е�����
class MyThread extends Thread{
	@Override
	public void run() {
		//����̵߳�����
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName());
	}
}


