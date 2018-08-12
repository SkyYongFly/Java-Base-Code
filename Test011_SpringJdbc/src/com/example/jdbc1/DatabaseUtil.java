package com.example.jdbc1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

//²Ù×÷Êý¾Ý¿â
public class DatabaseUtil {
	private DataSource dataSource;
	
	public DatabaseUtil() {
	}
	
	public DatabaseUtil(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	protected void insert(String sql) throws SQLException{
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		statement.execute(sql);
		statement.close();
		connection.close();
	}

}
