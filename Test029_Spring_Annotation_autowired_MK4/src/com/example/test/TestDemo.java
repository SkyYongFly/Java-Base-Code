package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.example.multibeans.Person;
import com.example.service.interfaces.ISystemServiceImpl;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDemo  extends UnitTestBase{

	public TestDemo() {
		super("applicationContext.xml");
	}
	
	/**
	 * �����Զ�װ��
	 */
	@Test
	public void testAutowired(){
		ISystemServiceImpl service = super.getBean("iSystemServiceImpl");
		service.saveData("��������");
	}
	
	/**
	 * ����list��map�Զ�װ��
	 */
	@Test
	public void test_ListOrMap_Autowired(){
		Person person = super.getBean("person");
		person.printPhoneName();
		person.printPhoneName2();
	}
	
	/**
	 * ����Qualifier
	 */
	@Test
	public void testQualifier(){
		Person person = super.getBean("person");
		person.printPhoneName3();
	}
}
