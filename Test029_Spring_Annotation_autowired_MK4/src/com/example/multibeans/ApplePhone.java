package com.example.multibeans;

import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.example.annotation.Apple;

//ͨ��ʵ�ֽӿڶ���bean��װ�䵽�����е�˳��
//@Primary
@Component
@Apple
public class ApplePhone implements Phone,Ordered{

	@Override
	public void printName() {
		System.out.println("ƻ���ֻ�");
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
