package com.example.factory;

import com.example.daomain.HelloWorld;
/**
 * ʵ������
 * @author ZY
 */
public class HelloStaticFactory2 {
	public  HelloWorld getClassInstance(){
		return new HelloWorld();
	}
}
