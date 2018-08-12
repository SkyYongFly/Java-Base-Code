package com.example.dao.interfaces;

public interface ISystemDao <T extends Object>{
	void saveData(T t);
}
