package com.example.pojo;

/**
 *	POJO 实体：用户
 * 
 * @author zhu
 */
public class User {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "用户ID：" + this.id + "  用户名：" + name;
	}
}
