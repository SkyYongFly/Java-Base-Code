package com.example.safe;

/**
 * 类方法加锁
 * @author zhu
 */
public class MethodLock {
	public static void main(String[] args) {
		NumManage numManage = new NumManage();
		
		Thread thread1 = new Thread(numManage,"线程1");
		Thread thread2 = new Thread(numManage,"线程2");
		Thread thread3 = new Thread(numManage,"线程3");
		Thread thread4 = new Thread(numManage,"线程4");
		Thread thread5 = new Thread(numManage,"线程5");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}

class NumManage implements Runnable{
	private static int num = 0;
	
	@Override
	public void run() {
		add();
	}
	
	//在静态方法上面加锁
	private synchronized  static void add(){
		for(int i = 0 ; i < 100 ; i++){
			num++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " : num=" + num);
	}
}
