package com.example.method;

/**
 * �߳�Join��������
 * @author zhu
 */
public class ThreadJoinDemo {
	public static void main(String[] args) {
		ThreadJoin threadJoin1 = new ThreadJoin();
		ThreadJoin threadJoin2 = new ThreadJoin();
		ThreadJoin threadJoin3 = new ThreadJoin();
		
		threadJoin1.setName("�ϴ�");
		threadJoin2.setName("С��1");
		threadJoin3.setName("С��2");
		
		threadJoin1.start();
		try {
			threadJoin1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadJoin2.start();
		threadJoin3.start();
		
	}
}
