package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.example.bean.Computer;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDemo  extends UnitTestBase{

	public TestDemo() {
		super("applicationContext.xml");
	}
	
	@Test
	public void testAnnotationBean(){
		Computer computer = super.getBean("COMPUTER");
		computer.getName("»ÝÆÕ");
	}
	
	@Test
	public void testScope(){
		Computer computer = super.getBean("COMPUTER");
		System.out.println(computer.hashCode());
		
		
		Computer computer2 = super.getBean("COMPUTER");
		System.out.println(computer2.hashCode());
	}
}
