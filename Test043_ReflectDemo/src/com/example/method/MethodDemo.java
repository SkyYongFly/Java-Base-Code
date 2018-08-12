package com.example.method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.example.bean.Person;

//����ʾ������ȡ���Ա����
public class MethodDemo {
	public static void main(String[] args) throws Exception{
		Class personCls = Class.forName("com.example.bean.Person");
		
		//1���������о���public���Եķ�������
		Method[] methods = personCls.getMethods();	//��������ķ���
		for (Method method : methods) {
			System.out.println(method);
		}
		
		System.out.println("---------------------------");
		
		//2�����ظ����е����еķ������飨����public�ͷ�public���ԣ�
		Method[] methods2 = personCls.getDeclaredMethods();
		for (Method method : methods2) {
			System.out.println(method);
		}
		
		System.out.println("---------------------------");
		
		//3�����ݷ������Ͳ���������һ������ľ���public���Եķ���
		Constructor constructor = personCls.getConstructor();
		Person person = (Person) constructor.newInstance();
		
		Method method1 = personCls.getMethod("getName",String.class);
		method1.invoke(person,"ϦϦ");	//ִ��ָ������ķ������в�����Ҫ���ݲ���
		
		System.out.println("---------------------------");
		
		//4�����ݷ������Ͳ���������һ������ķ���������public�ͷ�public���ԣ�
		Method method2 = personCls.getDeclaredMethod("printInfo"); //�޲�˽�з���
		method2.setAccessible(true);
		method2.invoke(person);
		
		
		//--------
		Method method3 = personCls.getDeclaredMethod("getAddress",String.class);
		Object object = method3.invoke(person, "��֮��");
		System.out.println(object);
	}
}
