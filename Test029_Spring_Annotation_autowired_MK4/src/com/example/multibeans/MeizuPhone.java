package com.example.multibeans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//ͨ��ע�ⶨ��bean��װ�䵽�����е�˳��
@Order(1)
@Component
public class MeizuPhone implements Phone{

	@Override
	public void printName() {
		System.out.println("�����ֻ�");
	}
 
}
