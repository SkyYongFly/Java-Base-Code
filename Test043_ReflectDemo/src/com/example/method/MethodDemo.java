package com.example.method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.example.bean.Person;

//反射示例：获取类成员方法
public class MethodDemo {
	public static void main(String[] args) throws Exception{
		Class personCls = Class.forName("com.example.bean.Person");
		
		//1、返回所有具有public属性的方法数组
		Method[] methods = personCls.getMethods();	//包括父类的方法
		for (Method method : methods) {
			System.out.println(method);
		}
		
		System.out.println("---------------------------");
		
		//2、返回该类中的所有的方法数组（不分public和非public属性）
		Method[] methods2 = personCls.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}
		
		System.out.println("---------------------------");
		
		//3、根据方法名和参数，返回一个具体的具有public属性的方法
		Constructor constructor = personCls.getConstructor();
		Person person = (Person) constructor.newInstance();
		
		Method method1 = personCls.getMethod("getName",String.class);
		method1.invoke(person,"夕夕");	//执行指定对象的方法，有参数需要传递参数
		
		System.out.println("---------------------------");
		
		//4、根据方法名和参数，返回一个具体的方法（不分public和非public属性）
		Method method2 = personCls.getDeclaredMethod("printInfo"); //无参私有方法
		method2.setAccessible(true);
		method2.invoke(person);
		
		
		//--------
		Method method3 = personCls.getDeclaredMethod("getAddress",String.class);
		Object object = method3.invoke(person, "海之南");
		System.out.println(object);
	}
}
