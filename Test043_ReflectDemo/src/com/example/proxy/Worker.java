package com.example.proxy;

public class Worker  implements Work{
	@Override
	public void work() {
		System.out.println("工人工作！");		
	}

	@Override
	public void eat() {
		System.out.println("工人吃饭！");
	}

	@Override
	public String play(String acticon) {
		System.out.println("工人在" + acticon);
		return "hah";
	}
}
