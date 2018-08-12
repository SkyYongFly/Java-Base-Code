package com.example.multibeans;

import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.example.annotation.Apple;

//通过实现接口定义bean被装配到集合中的顺序
//@Primary
@Component
@Apple
public class ApplePhone implements Phone,Ordered{

	@Override
	public void printName() {
		System.out.println("苹果手机");
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
