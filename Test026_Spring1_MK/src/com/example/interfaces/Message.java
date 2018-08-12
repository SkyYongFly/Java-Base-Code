package com.example.interfaces;

/**
 * 信息接口
 * 
 * @author zhu
 */
public interface Message <T extends Phone>{
	void sendMessage(T object);
}
