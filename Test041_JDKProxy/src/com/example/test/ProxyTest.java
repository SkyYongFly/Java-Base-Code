package com.example.test;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.example.dao.MyInterceptor;
import com.example.dao.PersonDao;
import com.example.dao.PersonDaoImpl;
import com.example.dao.Transaction;

/**
 * 1����������invoke��������ʱ��ִ�еģ�
 *     ���ڿͻ��ˣ����������÷�����ʱ�򣬽��뵽����������invoke����
 * 2���������ķ������������ʲô��
 *     ��������invoke���������ݾ��Ǵ������ķ���������
 * 3���������е�invoke�����еĲ���method��˭��ʲôʱ�򴫵ݹ����ģ�
 *     ���������÷�����ʱ�򣬽������������е�invoke����������invoke�����еĲ���method����
 *       ���������õķ���
 *
 */
public class ProxyTest {
	@Test
	public void testProxy(){
		/**
		 * 1������һ��Ŀ�����
		 * 2������һ������
		 * 3������һ��������
		 * 4����̬����һ���������
		 */
		PersonDaoImpl personDao = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		MyInterceptor myInterceptor = new MyInterceptor(personDao, transaction);
		
		/**
		 * 1��Ŀ������������
		 * 2��Ŀ����ʵ�ֵ����еĽӿ�
		 * 3��������
		 */
		PersonDao personDao2 = (PersonDao) Proxy.newProxyInstance(personDao.getClass().getClassLoader(),
				personDao.getClass().getInterfaces(),myInterceptor);
		personDao2.updatePerson();
	}
	
}
