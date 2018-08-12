package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.DataSource;
import com.example.bean.IntegerStore;
import com.example.bean.MeizuPhone;
import com.example.bean.Store;
import com.example.bean.config.StoreConfig;
import com.example.bean.config.StoreManager;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDemo  extends UnitTestBase{

	public TestDemo() {
		super("applicationContext.xml");
	}
	
	/**
	 * ����Java���õ�bean
	 */
	@Test
	public void  testConfigBean(){
		MeizuPhone phone = super.getBean("meizuPhone");
		phone.printName();
	}
	
	/**
	 * ����Java���û�������
	 */
	@Test
	public void testScope(){
		MeizuPhone phone = super.getBean("meizuPhone");
		System.out.println(phone.hashCode());
		
		MeizuPhone phone2 = super.getBean("meizuPhone");
		System.out.println(phone2.hashCode());
	}
	
	/**
	 * ����beanע�������ļ��������������ļ�
	 */
	@Test
	public void testResourceImport(){
		DataSource dataSource = super.getBean("dataSource");
		dataSource.printDriverInfo();
	}
	
	@Test
	public void testG(){
//		Store stringStore = super.getBean("integerStore");
//		
//		System.out.println(stringStore.hashCode());
		
		StoreManager storeManager = super.getBean("storeManager");
		IntegerStore integerStore = (IntegerStore) storeManager.getIntegerStore();
		System.out.println(integerStore.hashCode());
	}
	
	@Test
	public void  testJavaConfig(){
		 //1. ����Spring�����ģ�����java������
		ApplicationContext context = new AnnotationConfigApplicationContext(StoreConfig.class);
		
		//2. ͨ��Spring�����Ļ�ȡBean��������Springͨ���Զ�ɨ�跢����PersonHelloWorld��ʵ�֣����Զ�����bean��
		IntegerStore store = (IntegerStore) context.getBean("integerStore");
		
		System.out.println(store.hashCode());
	}
	
}
