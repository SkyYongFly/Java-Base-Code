package com.example.method;

/**
 *  ÿª§œﬂ≥Ã
 * @author zhu
 *
 */
public class ThreadDaemon  extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(getName() + " : " + i);
		}
	}
}
