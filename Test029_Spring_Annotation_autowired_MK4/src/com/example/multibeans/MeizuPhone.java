package com.example.multibeans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//通过注解定义bean被装配到集合中的顺序
@Order(1)
@Component
public class MeizuPhone implements Phone{

	@Override
	public void printName() {
		System.out.println("魅族手机");
	}
 
}
