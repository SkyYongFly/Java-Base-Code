package com.example.method;

/**
 *  守护线程测试，新建两个线程并设置为守护线程
 * @author zhu
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon threadDaemon1 = new ThreadDaemon();
		ThreadDaemon threadDaemon2 = new ThreadDaemon();
		
		//设置守护线程名称
		threadDaemon1.setName("守护线程1");
		threadDaemon2.setName("守护线程2");
		
		//设置为守护线程
		threadDaemon1.setDaemon(true);
		threadDaemon2.setDaemon(true);
		
		//启动守护线程
		threadDaemon1.start();
		threadDaemon2.start();
		
		Thread.currentThread().setName("用户线程");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
	}
}
