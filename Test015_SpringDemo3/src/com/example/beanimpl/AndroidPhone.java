package com.example.beanimpl;

import com.example.bean.Phone;

public class AndroidPhone implements Phone{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sendMessage() {
		System.out.println("ʹ��" + name + "�ֻ����Ͷ���");
	}
	

}
