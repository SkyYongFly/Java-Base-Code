package com.example.beanimpl;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.example.bean.Person;
import com.example.bean.Phone;

public class Chinese implements Person{
	private String name;
	private Phone phone;
	
	private List<String> books;
	private Map scores;
	private Map<String,Phone> allPhones;
	private Properties health;
	private Set info;
	private String[] food;
	
	
	public Chinese() {
	}
	
	public Chinese(String name,Phone phone){
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public void usePhone() {
		phone.sendMessage();
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public Phone getPhone() {
		return phone;
	}
	
	public String getName() {
		return name;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public Map getScores() {
		return scores;
	}

	public void setScores(Map scores) {
		this.scores = scores;
	}

	public Map<String, Phone> getAllPhones() {
		return allPhones;
	}

	public void setAllPhones(Map<String, Phone> allPhones) {
		this.allPhones = allPhones;
	}

	public Properties getHealth() {
		return health;
	}

	public void setHealth(Properties health) {
		this.health = health;
	}

	public Set getInfo() {
		return info;
	}

	public void setInfo(Set info) {
		this.info = info;
	}

	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
		this.food = food;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void test() {
		System.out.println(books);
		System.out.println(scores);
		System.out.println(allPhones);
		System.out.println(health);
		System.out.println(info);
		System.out.println(food);
	}
}
