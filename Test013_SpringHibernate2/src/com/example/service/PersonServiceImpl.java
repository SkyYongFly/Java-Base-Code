package com.example.service;

import com.example.dao.PersonDao;
import com.example.daomain.Person;

public class PersonServiceImpl implements PersonService{
	PersonDao personDao ;
	
	public PersonServiceImpl() {
	}
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson(Person person) {
		this.personDao.savePerson(person);
	}
}
