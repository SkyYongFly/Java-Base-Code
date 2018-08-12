package com.example.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 使用注解方式定义Bean
 * 
 * @author zhu
 */
@Scope("prototype")
@Component("COMPUTER")
public class Computer {
	
	public void getName(String name){
		System.out.println("名称：" + name);
	}
}
