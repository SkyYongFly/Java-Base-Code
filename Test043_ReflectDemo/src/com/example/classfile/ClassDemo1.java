package com.example.classfile;

import com.example.bean.Person;

/**
 * 反射示例：获取字节码文件的三种方式
 * 
 * @author zhu
 */
public class ClassDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//方式一:通过类实例的  getClass方法
		Person person = new Person();
		Person person2 = new Person();
		
		Class personCls = person.getClass();
		Class personCls2 = person2.getClass();
		
		System.out.println(person == person2);
		System.out.println(personCls == personCls2);
		
		System.out.println("---------------------------");
		
		//方式二：通过类  .class
		Class class1 = Person.class;
		System.out.println(personCls == class1);
		System.out.println(personCls2 == class1);
		
		System.out.println("---------------------------");
		
		//方式三：通过类加载器获取
		Class class3 = Class.forName("com.example.bean.Person");//必须是类全路径
		System.out.println(class3 == personCls);
	}
}
