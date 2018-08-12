package com.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean  implements InitializingBean,DisposableBean{

	/**
	 * ��ʼ������
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("���ǳ�ʼ������!");
	}

	/**
	 * ����ʱ����
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("�������ٷ�����");
	}

}
