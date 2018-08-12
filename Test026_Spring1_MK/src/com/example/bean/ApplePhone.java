package com.example.bean;

import com.example.interfaces.Phone;

public class ApplePhone extends Phone{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getPhoneName() {
		return  name;
	}

}
