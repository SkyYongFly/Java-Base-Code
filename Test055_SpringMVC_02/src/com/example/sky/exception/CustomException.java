package com.example.sky.exception;

/**
 * 自定义异常，SpringMVC处理过程中发生的预期异常都抛此异常
 * 
 * @author zhuyong
 */
public class CustomException extends Exception{
	//异常信息
	private String message;
	
	public CustomException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
