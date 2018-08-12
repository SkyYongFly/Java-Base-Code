/**
 * 
 */
package com.example.bean;

/**
 * @author 	:zhuyong
 */
public class Phone {
	private String name;
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public void sendMessage(){
		System.out.println("用" + name +  "手机发送短信");
	}
}
