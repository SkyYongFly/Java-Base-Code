package com.example.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ʹ��ע�ⷽʽ����Bean
 * 
 * @author zhu
 */
@Scope("prototype")
@Component("COMPUTER")
public class Computer {
	
	public void getName(String name){
		System.out.println("���ƣ�" + name);
	}
}
