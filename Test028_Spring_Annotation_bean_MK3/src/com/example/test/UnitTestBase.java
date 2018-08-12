package com.example.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.utils.StringUtil;

/**
 * ���Ի����� �����ڻ�ȡSpring����XML�ļ�����ȡbean
 * 
 * @author zhu
 */
public class UnitTestBase {
	private ClassPathXmlApplicationContext context;
	private String classPathXml;
	
	public UnitTestBase(String classPathXml) {
		this.classPathXml = classPathXml;
	}
	
	/**
	 * JUNIT��ʼ��֮ǰ��ʼ��������Spring����
	 */
	@Before
	public void initAndStartContext(){
		if(StringUtil.isNullOrEmpty(classPathXml)){
			classPathXml = "classpath*:spring-*.xml";
		}
		
		try{
			this.context = new ClassPathXmlApplicationContext(classPathXml.split("[,\\s]+"));
			context.start();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * �ر�Spring����
	 */
	@After
	public void destoryContext(){
		context.destroy();
	}
	
	
	@SuppressWarnings("unchecked")
	public <T extends Object> T getBean(String beanName){
		if(StringUtil.isNullOrEmpty(beanName) || null == context){
			return null;
		}
		
		return (T) context.getBean(beanName);
	}
}
