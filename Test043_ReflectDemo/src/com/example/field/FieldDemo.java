package com.example.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;

import com.example.bean.Person;

//����ʾ������ȡ��ĳ�Ա����
public class FieldDemo {
	public static void main(String[] args) throws Exception{
		Class personCls = Class.forName("com.example.bean.Person");
		
		//1�����ؾ���public���Եĳ�Ա����������
		Field[] fields = personCls.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("---------------------------");
		
		//2���������г�Ա������ɵ����飨����public�ͷ�public���ԣ�
		Field[] fields2 = personCls.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field + " : " + field.getType());
		}
		
		System.out.println("---------------------------");
		
		//3�����ݱ�����������һ������ľ���public���Եĳ�Ա����
		Field field = personCls.getField("address");
		Constructor constructor = personCls.getConstructor();
		Person person = (Person) constructor.newInstance();
		
		field.set(person,"�ൺ��");	//����ָ������ĳ�Ա����ֵΪ***�����������ʵ��Ҳ��ͨ�������ȡ��
		System.out.println(person.toString());
		
		System.out.println("---------------------------");
		
		//4�����ݱ�����������һ����Ա����������public�ͷ�public���ԣ�
		Constructor constructor2 = personCls.getConstructor();
		Person person2 = (Person) constructor.newInstance();
		
		Field address = personCls.getDeclaredField("address");
		Field age = personCls.getDeclaredField("age");
		Field name = personCls.getDeclaredField("name");
		
		address.setAccessible(true);
		age.setAccessible(true);
		name.setAccessible(true);
		
		address.set(person2, "����");
		age.set(person2, 20);
		name.set(person2, "��");
		
		System.out.println(person2.toString());
		
	}
}
