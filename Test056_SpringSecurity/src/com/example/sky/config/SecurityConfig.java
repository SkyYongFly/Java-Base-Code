package com.example.sky.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security������
 * 
 * @author zhuyong
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	/**
	 * ��������HTTP����
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
			authorizeRequests().anyRequest().authenticated().
			and().formLogin().
			and().httpBasic();
	}
	
	/**
	 * �����û���֤�߼�
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//�����ڴ��û��洢
		auth
			.inMemoryAuthentication()
			.withUser("xiaoming").password("0").roles("USER")
			.and()
			.withUser("sysadmin").password("1").roles("SYS");
	}
		
}
