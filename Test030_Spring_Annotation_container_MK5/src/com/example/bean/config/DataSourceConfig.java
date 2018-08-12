package com.example.bean.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.example.bean.DataSource;

@Configuration
@ImportResource("classpath:config.xml")
public class DataSourceConfig {
	@Value("${url}")
	private String url;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Bean(name="dataSource")
	public DataSource getDataSource(){
		return new DataSource(url,username,password);
	}
}
