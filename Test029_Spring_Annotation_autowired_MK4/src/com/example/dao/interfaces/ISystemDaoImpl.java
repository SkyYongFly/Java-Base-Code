package com.example.dao.interfaces;

import org.springframework.stereotype.Repository;

@Repository
public class ISystemDaoImpl implements ISystemDao<String>{

	@Override
	public void saveData(String data){
		System.out.println("dao�����������ݣ�" + data);
	}
}
