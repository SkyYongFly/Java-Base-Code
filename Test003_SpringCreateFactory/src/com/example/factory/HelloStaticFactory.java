package com.example.factory;

import com.example.daomain.HelloWorld;
/**
 * ¾²Ì¬¹¤³§
 * @author ZY
 */
public class HelloStaticFactory {
	public static HelloWorld getClassInstance(){
		return new HelloWorld();
	}
}
