package com.example.sky.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security配置类
 * 
 * @author zhuyong
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	/**
	 * 配置拦截HTTP请求
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
			authorizeRequests().anyRequest().authenticated().
			and().formLogin().
			and().httpBasic();
	}
	
	/**
	 * 配置用户验证逻辑
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//启动内存用户存储
		auth
			.inMemoryAuthentication()
			.withUser("xiaoming").password("0").roles("USER")
			.and()
			.withUser("sysadmin").password("1").roles("SYS");
	}
		
}
