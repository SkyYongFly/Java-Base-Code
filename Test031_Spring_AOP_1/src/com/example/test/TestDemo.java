package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.example.bean.Service;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDemo  extends UnitTestBase{

	public TestDemo() {
		super("applicationContext.xml");
	}
	
	@Test
	public void testGetBean(){
		Service dataService = super.getBean("dataService");
		dataService.insertData("���100��");
		dataService.getData();
	}
	
}
