package com.example.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Person;
import com.example.beanimpl.Chinese;

public class TestDemo {
	/**
	 * ����Ƕ��bean
	 */
	@Test
	public void testChinese(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Person chinese = context.getBean("chinese",Chinese.class);
		chinese.usePhone();
		
		//Ƕ��ʽBean��ȡ������Ӧ��bean
//		Phone wiun = context.getBean("winphone",Phone.class);
//		wiun.sendMessage();
		
		Person xiaoliu = context.getBean("xiaoliu",Chinese.class);
		xiaoliu.usePhone();
	}
	
	/**
	 * ���Դ�ӡ���еĳ�Ա����
	 */
	@Test
	public void testAttr(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Chinese tuhao = context.getBean("tuhao",Chinese.class);
		tuhao.test();
	}
	
	/**
	 * �����������
	 */
	@Test
	public void testComAttr(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Chinese hong = context.getBean("xiaohong",Chinese.class);
		//hong.getPhone().sendMessage();
		hong.usePhone();
	}
	
	

}
