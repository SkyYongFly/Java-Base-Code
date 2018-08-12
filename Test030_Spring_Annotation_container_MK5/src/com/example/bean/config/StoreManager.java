package com.example.bean.config;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bean.Store;

public class StoreManager {
	@Autowired
	private Store<Integer> integerStore;
	
	@Autowired
	private Store<String> stringStore;
	
	public Store<Integer> getIntegerStore() {
		return integerStore;
	}
	
	public Store<String> getStringStore() {
		return stringStore;
	}

}
