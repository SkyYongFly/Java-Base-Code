package com.example.impl;

import com.example.interfaces.Message;
import com.example.interfaces.Phone;

/**
 * ���Žӿ�ʵ����
 * 
 * @author zhu
 */
public class MessageImpl implements Message<Phone>{

	@Override
	public void sendMessage(Phone phone) {
		System.out.println("ʹ��" + phone.getPhoneName() + "���Ͷ��ţ�");
	}

}
