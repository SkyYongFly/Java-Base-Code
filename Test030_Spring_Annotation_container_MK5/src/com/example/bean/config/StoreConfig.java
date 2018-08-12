package com.example.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.bean.IntegerStore;
import com.example.bean.StringStore;

@Configuration
@ComponentScan
public class StoreConfig {
	
	@Bean
	public StringStore getStringStore(){
		return new StringStore();
	}
	
	@Bean(name="integerStore")
	public IntegerStore getIntegerStore(){
		return new IntegerStore();
	}
	
	
	@Bean(name="storeManager")
	public StoreManager getStoreManager(){
		return new StoreManager();
	}
}
