package com.example.method;

/**
 * 线程Join方法测试
 * @author zhu
 */
public class ThreadJoinDemo {
	public static void main(String[] args) {
		ThreadJoin threadJoin1 = new ThreadJoin();
		ThreadJoin threadJoin2 = new ThreadJoin();
		ThreadJoin threadJoin3 = new ThreadJoin();
		
		threadJoin1.setName("老大");
		threadJoin2.setName("小弟1");
		threadJoin3.setName("小弟2");
		
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
