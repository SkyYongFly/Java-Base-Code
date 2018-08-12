package com.example.safe;

/**
 * �̰߳�ȫ������
 * @author zhu
 */
public class SafeThread {
	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		
		Thread thread1 = new Thread(myThread);
		Thread thread2 = new Thread(myThread);
		Thread thread3 = new Thread(myThread);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyThread2 implements Runnable{
	private int num = 0;
	
	@Override
	public void run() {
		//��ͬ�������Ӹ���
		synchronized(this){
			for(int i = 0 ; i < 50 ; i++){
				num++;
			}
			System.out.println(Thread.currentThread().getName() + "_num��ֵ��" + num);
		}
	}
}

