	package com.example.dao;
	
	public class PersonDaoImpl implements PersonDao {
	
		public String updatePerson() {
			System.out.println("update person");
			int i = 1/0;
			return "haha";
		}
	
	}
