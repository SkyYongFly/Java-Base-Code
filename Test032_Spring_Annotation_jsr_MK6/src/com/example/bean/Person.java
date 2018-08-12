package com.example.bean;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	//Resource ������ ��Ա����
//	@Resource
//	private MeizuPhone meizuPhone;
	
	private MeizuPhone meizuPhone;
	
	//Resource ������ ����
	@Resource
	public void setMeizuPhone(MeizuPhone meizuPhone) {
		this.meizuPhone = meizuPhone;
	}
	
	
	public void printPhoneName(){
		meizuPhone.printName();
	}
}
