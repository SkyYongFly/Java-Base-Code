/**
 * 
 */
package com.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author 	:zhuyong
 */
public class Phone  implements InitializingBean ,DisposableBean{
	private String name;
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		System.out.println("正在设置name属性值");
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public void sendMessage(){
		System.out.println("用" + name +  "手机发送短信");
	}
	
	//在spring配置文件中指定该方法为设置属性后执行的方法
	//作用同实现InitializingBean接口方法一样
	public void init(){
		System.out.println("正在初始化方法 init");
	}

	/**
	 * 实现了InitializingBean接口实现的方法
	 * 表明在依赖注入之后即设置完成员变量后的行为动作
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("正在初始化方法  afterPropertiesSet");
	}
	
	/**
	 * 在配置文件中设置bean销毁之前执行的方法
	 */
	public void close(){
		System.out.println("正在执行销毁bean之前的方法  close");
	}

	/**
	 * 实现DisposableBean，指定bean销毁之前的执行的方法
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("正在执行bean销毁之前的方法  destroy");
	}
}
