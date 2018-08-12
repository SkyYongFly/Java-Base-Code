package com.example.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.bean.MeizuPhone;
import com.example.bean.Phone;

/**
 * Phone  bean ������
 * 
 * @author zhu
 */
@Configuration
public class PhoneConfig {
	
	//����bean,��ʼ�����������ٷ���
	@Bean(name="meizuPhone",initMethod="init",destroyMethod="destory")
	@Scope(value="singleton")
	public Phone getMeizuPhone(){
		return new MeizuPhone();
	}
}
