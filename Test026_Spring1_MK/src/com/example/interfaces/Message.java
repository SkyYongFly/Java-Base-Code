package com.example.interfaces;

/**
 * ��Ϣ�ӿ�
 * 
 * @author zhu
 */
public interface Message <T extends Phone>{
	void sendMessage(T object);
}
