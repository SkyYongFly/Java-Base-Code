package com.example.beanimpl;

import com.example.bean.Phone;

public class AndroidPhone implements Phone{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sendMessage() {
		System.out.println("使用" + name + "手机发送短信");
	}
	

}
