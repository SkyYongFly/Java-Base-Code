package com.example.bean;

/**
 * @author 	:zhuyong
 */
public class Person {
	private Phone phone;
	
	public Person(Phone phone) {
		this.phone = phone;
	}
	
	/**
	 * @return the phone
	 */
	public Phone getPhone() {
		return phone;
	}
	
	public void sendMessage(){
		phone.sendMessage();
	}
}
