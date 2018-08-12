package com.example.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;

import com.example.bean.Person;

//反射示例：获取类的成员变量
public class FieldDemo {
	public static void main(String[] args) throws Exception{
		Class personCls = Class.forName("com.example.bean.Person");
		
		//1、返回具有public属性的成员变量的数组
		Field[] fields = personCls.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("---------------------------");
		
		//2、返回所有成员变量组成的数组（不分public和非public属性）
		Field[] fields2 = personCls.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field + " : " + field.getType());
		}
		
		System.out.println("---------------------------");
		
		//3、根据变量名，返回一个具体的具有public属性的成员变量
		Field field = personCls.getField("address");
		Constructor constructor = personCls.getConstructor();
		Person person = (Person) constructor.newInstance();
		
		field.set(person,"青岛市");	//设置指定对象的成员变量值为***，而这个对象实例也是通过反射获取的
		System.out.println(person.toString());
		
		System.out.println("---------------------------");
		
		//4、根据变量名，返回一个成员变量（不分public和非public属性）
		Constructor constructor2 = personCls.getConstructor();
		Person person2 = (Person) constructor.newInstance();
		
		Field address = personCls.getDeclaredField("address");
		Field age = personCls.getDeclaredField("age");
		Field name = personCls.getDeclaredField("name");
		
		address.setAccessible(true);
		age.setAccessible(true);
		name.setAccessible(true);
		
		address.set(person2, "淮安");
		age.set(person2, 20);
		name.set(person2, "永");
		
		System.out.println(person2.toString());
		
	}
}
