package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.example.bean.MeizuPhone;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDemo  extends UnitTestBase{

	public TestDemo() {
		super("applicationContext.xml");
	}
	
	/**
	 * ≤‚ ‘ \\@Resorce
	 */
	@Test
	public void  testConfigBean(){
		MeizuPhone phone = super.getBean("meizuPhone");
		phone.printName();
	}
	
}
