package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.example.bean.ResourceManager;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDemo  extends UnitTestBase{

	public TestDemo() {
		super("applicationContext.xml");
	}
	
	@Test
	public void testSendMessage(){
		ResourceManager resourceManager = super.getBean("resourceManager");
		resourceManager.getResourceInfo();
	}
}
