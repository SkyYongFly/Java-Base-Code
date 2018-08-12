package com.example.method;

/**
 *  �ػ��̲߳��ԣ��½������̲߳�����Ϊ�ػ��߳�
 * @author zhu
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon threadDaemon1 = new ThreadDaemon();
		ThreadDaemon threadDaemon2 = new ThreadDaemon();
		
		//�����ػ��߳�����
		threadDaemon1.setName("�ػ��߳�1");
		threadDaemon2.setName("�ػ��߳�2");
		
		//����Ϊ�ػ��߳�
		threadDaemon1.setDaemon(true);
		threadDaemon2.setDaemon(true);
		
		//�����ػ��߳�
		threadDaemon1.start();
		threadDaemon2.start();
		
		Thread.currentThread().setName("�û��߳�");
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		
	}
}
