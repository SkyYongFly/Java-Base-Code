package com.example.beanimpl;

import com.example.bean.Phone;

public class WinPhone  implements Phone{
	private String name;
	
	public WinPhone(String name) {
		this.name = name;
	}
	

	@Override
	public void sendMessage() {
		System.out.println("使用" + name + "手机发送短信");
	}

}
