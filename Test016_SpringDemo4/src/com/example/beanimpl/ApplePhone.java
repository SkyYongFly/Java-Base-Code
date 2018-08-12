package com.example.beanimpl;

import com.example.bean.Phone;

public class ApplePhone implements Phone{

	@Override
	public void sendMessage() {
		System.out.println("使用苹果手机发送短信");
	}

}
