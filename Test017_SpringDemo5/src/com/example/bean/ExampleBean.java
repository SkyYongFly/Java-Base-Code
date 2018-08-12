package com.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean  implements InitializingBean,DisposableBean{

	/**
	 * 初始化方法
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是初始化方法!");
	}

	/**
	 * 销毁时方法
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("我是销毁方法！");
	}

}
