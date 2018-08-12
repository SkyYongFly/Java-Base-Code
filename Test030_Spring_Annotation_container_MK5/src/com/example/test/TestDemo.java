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
	 * 测试Java配置的bean
	 */
	@Test
	public void  testConfigBean(){
		MeizuPhone phone = super.getBean("meizuPhone");
		phone.printName();
	}
	
	/**
	 * 测试Java配置化作用域
	 */
	@Test
	public void testScope(){
		MeizuPhone phone = super.getBean("meizuPhone");
		System.out.println(phone.hashCode());
		
		MeizuPhone phone2 = super.getBean("meizuPhone");
		System.out.println(phone2.hashCode());
	}
	
	/**
	 * 测试bean注解配置文件引入属性配置文件
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
		 //1. 声明Spring上下文，采用java配置类
		ApplicationContext context = new AnnotationConfigApplicationContext(StoreConfig.class);
		
		//2. 通过Spring上下文获取Bean，在这里Spring通过自动扫描发现了PersonHelloWorld的实现，并自动创建bean。
		IntegerStore store = (IntegerStore) context.getBean("integerStore");
		
		System.out.println(store.hashCode());
	}
	
}
