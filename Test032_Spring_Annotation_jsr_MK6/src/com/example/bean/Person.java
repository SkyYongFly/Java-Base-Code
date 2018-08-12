package com.example.bean;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	//Resource 作用于 成员变量
//	@Resource
//	private MeizuPhone meizuPhone;
	
	private MeizuPhone meizuPhone;
	
	//Resource 作用于 方法
	@Resource
	public void setMeizuPhone(MeizuPhone meizuPhone) {
		this.meizuPhone = meizuPhone;
	}
	
	
	public void printPhoneName(){
		meizuPhone.printName();
	}
}
