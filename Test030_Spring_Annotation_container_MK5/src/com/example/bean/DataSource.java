package com.example.bean;

public class DataSource {
	private String url;
	private String username;
	private String password;
	
	public DataSource(String url,String username,String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public void printDriverInfo(){
		System.out.println("���ݿ�URL��ַ��" + url);
		System.out.println("���ݿ��û�����" + username);
		System.out.println("���ݿ����룺" + password);
	}

}
