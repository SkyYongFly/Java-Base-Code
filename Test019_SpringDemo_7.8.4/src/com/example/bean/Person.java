package com.example.bean;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 实现 BeanNameAware接口，为了获取Bean本身的id
 * 
 * @author 	:zhuyong
 */
public class Person implements BeanNameAware{
	private String beanName;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	public void info(){
		System.out.println("部署该bean 时指定的id为：" + beanName);
	}
}
