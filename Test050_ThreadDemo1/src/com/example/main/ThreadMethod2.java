package com.example.main;

/**
 * �߳�ʵ�ֵķ�ʽ����ʵ��Runnable�ӿ�
 * @author zhu
 */
public class ThreadMethod2 {
	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		
		//���Ǵ���ģ���Ϊ��ʽ�������Ǽ̳�Thread�࣬��û��start����
		//myThread3.start();
		
		Thread thread = new Thread(myThread3);
		Thread thread2 = new Thread(myThread3);
		
		thread.start();
		thread2.start();
	}
}

//ʵ��Runnable�ӿ�
class MyThread3 implements Runnable{
	@Override
	public void run() {
		System.out.println("�߳����ƣ�" + Thread.currentThread().getName());
	}
	
}
