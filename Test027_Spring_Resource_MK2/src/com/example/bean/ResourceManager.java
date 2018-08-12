package com.example.bean;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 * 资源类
 * 
 * @author zhu
 */
public class ResourceManager  implements ApplicationContextAware{
	private ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
	}
	
	public void getResourceInfo(){
		try {
//			Resource resource =  context.getResource("classpath:test.txt");
//			Resource resource =  context.getResource("file:D:\\Origin\\debug.log");
//			Resource resource =  context.getResource("http://tool.oschina.net/apidocs/apidoc?api=dbcp");
			Resource resource =  context.getResource("test.txt"); //同ApplicationContext一样，这里采用classpath方式
			
			System.out.println(resource.getFilename());
			System.out.println(resource.contentLength());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
