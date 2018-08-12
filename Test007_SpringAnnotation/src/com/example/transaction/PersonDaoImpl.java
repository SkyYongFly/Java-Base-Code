package com.example.transaction;

import org.springframework.stereotype.Repository;

@Repository("persondao")
public class PersonDaoImpl  implements PersonDao{
	public void getPerson() {
		System.out.println("get the person");
	}
}
