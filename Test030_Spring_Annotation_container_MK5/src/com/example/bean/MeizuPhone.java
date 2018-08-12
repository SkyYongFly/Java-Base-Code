package com.example.bean;

public class MeizuPhone implements Phone{

	public void printName(){
		System.out.println("魅族手机");
	}
	
	public void init(){
		System.out.println("初始化方法");
	}
	
	public void destory(){
		System.out.println("销毁方法");
	}
}
