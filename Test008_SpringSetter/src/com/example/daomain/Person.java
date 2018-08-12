package com.example.daomain;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Properties;

public class Person {
	private String  name;
	private Long age;
	private Student student;
	private List<Object> list;
	private Set<Object> sets;
	private HashMap<String,Object> map;
	private Properties properties;
	private Object[] objects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public HashMap<String, Object> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Object[] getObjects() {
		return objects;
	}
	public void setObjects(Object[] objects) {
		this.objects = objects;
	}

}
