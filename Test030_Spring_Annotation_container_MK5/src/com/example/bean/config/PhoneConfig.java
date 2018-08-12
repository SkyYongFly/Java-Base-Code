package com.example.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.bean.MeizuPhone;
import com.example.bean.Phone;

/**
 * Phone  bean 配置类
 * 
 * @author zhu
 */
@Configuration
public class PhoneConfig {
	
	//定义bean,初始化方法，销毁方法
	@Bean(name="meizuPhone",initMethod="init",destroyMethod="destory")
	@Scope(value="singleton")
	public Phone getMeizuPhone(){
		return new MeizuPhone();
	}
}
