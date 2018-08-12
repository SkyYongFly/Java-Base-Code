package com.example.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * �̳߳ز��Դ���
 * @author zhu
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//�����̳߳�
		//�����߳�����5������߳�����10������߳���������5�ҿ����߳�ʱ��ȴ�����200���������١����񻺴������໺��5������
		ThreadPoolExecutor threadPoolExecutor = 
				new ThreadPoolExecutor(5, 10, 200,TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));
		
		for(int i = 0 ; i < 20; i++){
			MyTask myTask = new MyTask();
			
			//�������̳߳�ִ��
			threadPoolExecutor.execute(myTask);
			
			//��ӡ�����Ϣ
			System.out.println("�̳߳����߳���Ŀ��" + threadPoolExecutor.getPoolSize() + ";�����еȴ�ִ������" +
			threadPoolExecutor.getQueue().size() + ";��ִ����������Ŀ��" + threadPoolExecutor.getCompletedTaskCount());
		}
	}
}

class MyTask implements Runnable{
	@Override
	public void run() {
		System.out.println("�߳�_" + Thread.currentThread().getName() + " ִ����ϣ�");
	}
}
