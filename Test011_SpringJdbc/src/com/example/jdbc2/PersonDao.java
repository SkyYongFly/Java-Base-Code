package com.example.jdbc2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDao extends JdbcDaoSupport{
	public void savePerson(String sql){
		this.getJdbcTemplate().execute(sql);
	}
}
