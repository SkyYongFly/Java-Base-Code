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
		System.out.println("�ҵ����ֽ�" + name);
	}
	
	public static String getInfo(){
		return "�ҵ����ֽ�С��������10";
	}
	
	public String getAddress(String address){
		return address;
	}
	
	private void printInfo(){
		System.out.println("�ҵ����ֽ�С��������8");
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
}
