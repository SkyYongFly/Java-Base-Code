package com.example.factory;

import com.example.daomain.HelloWorld;
/**
 * ��̬����
 * @author ZY
 */
public class HelloStaticFactory {
	public static HelloWorld getClassInstance(){
		return new HelloWorld();
	}
}
