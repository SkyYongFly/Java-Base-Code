package com.example.bean;

/**
 * @author 	:zhuyong
 */
public abstract class Person {
	private Phone phone;
	
	//定义抽象方法，在配置文件中指定实现的内容
	public abstract Phone getPhone();
	
	public Person(){
		
	}
	
	public void sendMessage(){
		System.out.println("我用  " + getPhone() + " 手机发送短信");
	}
}
