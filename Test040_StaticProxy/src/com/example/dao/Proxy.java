package com.example.dao;

public class Proxy implements PersonDao{
	private PersonDao personDao;
	private Transaction transaction;

	public Proxy(PersonDao personDao,Transaction transaction) {
		this.personDao = personDao;
		this.transaction = transaction;
	}

	//利用静态代理实现类方法的事物操作
	public void updataPerson() {
		transaction.beginTransaction();
		personDao.updataPerson();
		transaction.commint();
	}
}
