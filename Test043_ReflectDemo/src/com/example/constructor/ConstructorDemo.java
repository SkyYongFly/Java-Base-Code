package com.example.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.example.bean.Person;

/**
 * 反射示例：获取类的构造方法
 * 
 * @author zhu
 */
public class ConstructorDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class personCls = Class.forName("com.example.bean.Person");
		
		//获取所有的public属性的构造方法
		Constructor[] constructors = personCls.getConstructors();
		for(Constructor constructor : constructors){
			System.out.println(constructor);
		}
		
		System.out.println("---------------------------");
		
		//获取所有的构造方法（包括public 和 private 属性）
		Constructor[] constructors2 = personCls.getDeclaredConstructors();
		for(Constructor constructor : constructors2){
			System.out.println(constructor);
		}
		
		System.out.println("---------------------------");
		
		//根据构造函数的参数，返回一个具体的具有public属性的构造函数
		Constructor constructor1 = personCls.getConstructor();
		Constructor constructor2 = personCls.getConstructor(String.class,int.class);//Integer.class会出错
		
		Person person1 = (Person) constructor1.newInstance();
		Person person2 = (Person) constructor2.newInstance("犬夜叉",1000);
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
		System.out.println("---------------------------");
		
		//根据构造函数的参数，返回一个具体的构造函数（不分public和非public属性）
		Constructor constructor3 = personCls.getDeclaredConstructor(String.class,int.class);
		Constructor constructor4 = personCls.getDeclaredConstructor(String.class);
		
		Person person3 = (Person) constructor3.newInstance("天明",15);
		
		//Exception in thread "main" java.lang.IllegalAccessException:
		//Class com.example.constructor.ConstructorDemo can not access a member
		//of class com.example.bean.Person with modifiers "private"
		//
		//对于私有构造方法，通过反射获取其对象后不允许直接创建类实例，所以我们强制设置允许
		constructor4.setAccessible(true);
		Person person4 = (Person) constructor4.newInstance("月");
		
		System.out.println(person3.toString());
		System.out.println(person4.toString());
	}
}
