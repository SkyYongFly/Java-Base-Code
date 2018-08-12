package com.example.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.example.bean.Person;

/**
 * ����ʾ������ȡ��Ĺ��췽��
 * 
 * @author zhu
 */
public class ConstructorDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class personCls = Class.forName("com.example.bean.Person");
		
		//��ȡ���е�public���ԵĹ��췽��
		Constructor[] constructors = personCls.getConstructors();
		for(Constructor constructor : constructors){
			System.out.println(constructor);
		}
		
		System.out.println("---------------------------");
		
		//��ȡ���еĹ��췽��������public �� private ���ԣ�
		Constructor[] constructors2 = personCls.getDeclaredConstructors();
		for(Constructor constructor : constructors2){
			System.out.println(constructor);
		}
		
		System.out.println("---------------------------");
		
		//���ݹ��캯���Ĳ���������һ������ľ���public���ԵĹ��캯��
		Constructor constructor1 = personCls.getConstructor();
		Constructor constructor2 = personCls.getConstructor(String.class,int.class);//Integer.class�����
		
		Person person1 = (Person) constructor1.newInstance();
		Person person2 = (Person) constructor2.newInstance("Ȯҹ��",1000);
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
		System.out.println("---------------------------");
		
		//���ݹ��캯���Ĳ���������һ������Ĺ��캯��������public�ͷ�public���ԣ�
		Constructor constructor3 = personCls.getDeclaredConstructor(String.class,int.class);
		Constructor constructor4 = personCls.getDeclaredConstructor(String.class);
		
		Person person3 = (Person) constructor3.newInstance("����",15);
		
		//Exception in thread "main" java.lang.IllegalAccessException:
		//Class com.example.constructor.ConstructorDemo can not access a member
		//of class com.example.bean.Person with modifiers "private"
		//
		//����˽�й��췽����ͨ�������ȡ����������ֱ�Ӵ�����ʵ������������ǿ����������
		constructor4.setAccessible(true);
		Person person4 = (Person) constructor4.newInstance("��");
		
		System.out.println(person3.toString());
		System.out.println(person4.toString());
	}
}
