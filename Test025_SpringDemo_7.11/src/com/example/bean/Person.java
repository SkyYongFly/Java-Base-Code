package com.example.bean;

/**
 * @author 	:zhuyong
 */
public class Person {
	private int age;
	private Phone phone;

	public Person() {
	}
	
	public Person(Phone phone) {
		this.phone = phone;
	}
	
	public Person(int age,Phone phone){
		this.age = age;
		this.phone = phone;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public void sendMessage(){
		if(phone == null){
			System.out.println("没有手机，发不了短信");
		}else{
			phone.sendMessage();
		}
	}
	
	public void print(){
		System.out.println("年龄：" + age);
	}
}
