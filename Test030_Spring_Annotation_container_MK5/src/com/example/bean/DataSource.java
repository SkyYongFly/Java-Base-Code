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
		System.out.println("数据库URL地址：" + url);
		System.out.println("数据库用户名：" + username);
		System.out.println("数据库密码：" + password);
	}

}
