package com.example.multibeans;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.annotation.Apple;

@Component
public class Person {
	//�����Զ�װ��
	@Autowired
	private List<Phone> phoneList;	
	
	//map�Զ�װ��
	@Autowired
	private Map<String, Phone> phoneMap;
	
	public void printPhoneName(){
		System.out.println("list...........");
		
		if(null != phoneList && phoneList.size() > 0){
			for(Phone phone : phoneList){
				phone.printName();
			}
		}else{
			System.out.println("û���ֻ�������");
		}
	}
	
	public void printPhoneName2(){
		System.out.println("\nmap...........");
		
		if(null == phoneMap || phoneMap.size() == 0){
			System.out.println("û���ֻ�������");
		}else{
			for(Map.Entry<String, Phone> phone : phoneMap.entrySet()){
				System.out.println("map���ƣ�" + phone.getKey());
				phone.getValue().printName();
			}
		}
	}
	
	//************************************************
	
	//Qualifier��ʹ�ã���Сbeanװ�䷶Χ���ж��ƥ������
	@Autowired
	@Apple
	private Phone phone;
	
	public void printPhoneName3(){
		phone.printName();
	}
}
