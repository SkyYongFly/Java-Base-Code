package com.example.bean;

/**
 * @author 	:zhuyong
 */
public class Person {
	private Phone phone;

	public Person() {
	}

	public Person(Phone phone) {
		this.phone = phone;
	}
	
	public void sendMessage(){
		if(phone == null){
			System.out.println("没有手机，发不了短信");
		}else{
			phone.sendMessage();
		}
	}
}
