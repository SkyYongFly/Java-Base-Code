package com.example.dao;

public class Proxy implements PersonDao{
	private PersonDao personDao;
	private Transaction transaction;

	public Proxy(PersonDao personDao,Transaction transaction) {
		this.personDao = personDao;
		this.transaction = transaction;
	}

	//���þ�̬����ʵ���෽�����������
	public void updataPerson() {
		transaction.beginTransaction();
		personDao.updataPerson();
		transaction.commint();
	}
}
