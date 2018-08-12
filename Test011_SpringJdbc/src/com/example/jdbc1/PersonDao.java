package com.example.jdbc1;

import java.sql.SQLException;


public class PersonDao extends DatabaseUtil{
	public void savePerson() throws SQLException{
		this.insert("insert into person values('zhu',23)");
	}
}
