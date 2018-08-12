package com.example.method;

/**
 * ×èÈûÏß³Ì 
 * @author zhu
 */
public class ThreadJoin extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + " : " + i);
		}
	}
}
