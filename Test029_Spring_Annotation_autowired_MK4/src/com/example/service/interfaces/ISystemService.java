package com.example.service.interfaces;

import com.example.dao.interfaces.ISystemDaoImpl;

public interface ISystemService <T extends ISystemDaoImpl>{
	void  setDao(T t);
}
