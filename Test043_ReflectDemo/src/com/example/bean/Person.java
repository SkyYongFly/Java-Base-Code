package com.example.bean;

public class Person {
	int age;
	private String name;
	public String address;
	
	public Person(){
		
	}
	
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	
	private Person(String name){
		this.name = name;
	}
	
	public void getName(String name){
		System.out.println("我的名字叫" + name);
	}
	
	public static String getInfo(){
		return "我的名字叫小明，年龄10";
	}
	
	public String getAddress(String address){
		return address;
	}
	
	private void printInfo(){
		System.out.println("我的名字叫小芳，年龄8");
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
}
