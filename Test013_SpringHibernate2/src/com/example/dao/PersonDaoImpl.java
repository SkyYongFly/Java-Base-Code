package com.example.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.example.daomain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{

	@Override
	public void savePerson(Person person) {
		this.getHibernateTemplate().save(person);
	}

}
