package com.example.impl;

import com.example.interfaces.Message;
import com.example.interfaces.Phone;

/**
 * 短信接口实现类
 * 
 * @author zhu
 */
public class MessageImpl implements Message<Phone>{

	@Override
	public void sendMessage(Phone phone) {
		System.out.println("使用" + phone.getPhoneName() + "发送短信！");
	}

}
