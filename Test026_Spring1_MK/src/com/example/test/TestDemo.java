package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.example.interfaces.Message;
import com.example.interfaces.Phone;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDemo  extends UnitTestBase{

	public TestDemo() {
		super("applicationContext.xml");
	}
	
	@Test
	public void testSendMessage(){
		Message<Phone> message = super.getBean("messageImpl");
		Phone meizuPhone = super.getBean("meizuPhone");
		
		message.sendMessage(meizuPhone);
	}
}
