package com.example.proxy;

public class Worker  implements Work{
	@Override
	public void work() {
		System.out.println("���˹�����");		
	}

	@Override
	public void eat() {
		System.out.println("���˳Է���");
	}

	@Override
	public String play(String acticon) {
		System.out.println("������" + acticon);
		return "hah";
	}
}
