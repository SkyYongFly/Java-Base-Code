package com.example.classfile;

import com.example.bean.Person;

/**
 * ����ʾ������ȡ�ֽ����ļ������ַ�ʽ
 * 
 * @author zhu
 */
public class ClassDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//��ʽһ:ͨ����ʵ����  getClass����
		Person person = new Person();
		Person person2 = new Person();
		
		Class personCls = person.getClass();
		Class personCls2 = person2.getClass();
		
		System.out.println(person == person2);
		System.out.println(personCls == personCls2);
		
		System.out.println("---------------------------");
		
		//��ʽ����ͨ����  .class
		Class class1 = Person.class;
		System.out.println(personCls == class1);
		System.out.println(personCls2 == class1);
		
		System.out.println("---------------------------");
		
		//��ʽ����ͨ�����������ȡ
		Class class3 = Class.forName("com.example.bean.Person");//��������ȫ·��
		System.out.println(class3 == personCls);
	}
}
