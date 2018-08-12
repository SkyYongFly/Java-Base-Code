package com.example.test;

import org.junit.Test;

import com.example.dao.PersonDao;
import com.example.dao.PersonDaoImpl;
import com.example.dao.Proxy;
import com.example.dao.Transaction;

public class ProxyTest {
	@Test
	public void testProxy(){
		PersonDao personDao = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		Proxy proxy = new Proxy(personDao, transaction);
		proxy.updataPerson();
	}
}
