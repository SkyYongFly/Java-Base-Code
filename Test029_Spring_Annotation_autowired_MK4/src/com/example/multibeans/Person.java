package com.example.multibeans;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.annotation.Apple;

@Component
public class Person {
	//集合自动装配
	@Autowired
	private List<Phone> phoneList;	
	
	//map自动装配
	@Autowired
	private Map<String, Phone> phoneMap;
	
	public void printPhoneName(){
		System.out.println("list...........");
		
		if(null != phoneList && phoneList.size() > 0){
			for(Phone phone : phoneList){
				phone.printName();
			}
		}else{
			System.out.println("没有手机。。。");
		}
	}
	
	public void printPhoneName2(){
		System.out.println("\nmap...........");
		
		if(null == phoneMap || phoneMap.size() == 0){
			System.out.println("没有手机。。。");
		}else{
			for(Map.Entry<String, Phone> phone : phoneMap.entrySet()){
				System.out.println("map名称：" + phone.getKey());
				phone.getValue().printName();
			}
		}
	}
	
	//************************************************
	
	//Qualifier的使用，缩小bean装配范围（有多个匹配会错误）
	@Autowired
	@Apple
	private Phone phone;
	
	public void printPhoneName3(){
		phone.printName();
	}
}
