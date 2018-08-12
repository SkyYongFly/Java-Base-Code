package com.example.service.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.interfaces.ISystemDao;
import com.example.dao.interfaces.ISystemDaoImpl;

@Service("iSystemServiceImpl")
public class ISystemServiceImpl implements ISystemService<ISystemDaoImpl>{
	//方式一：设置成员变量自动装配
//	@Autowired
//	private ISystemDao<String> systemDaoImpl;
	
	
	//方式二：设置构造方法自动装配
	private ISystemDao<String> systemDaoImpl;
	
	@Autowired
	public ISystemServiceImpl(ISystemDao<String> iSystemDao) {
		systemDaoImpl = iSystemDao;
	}
	
	
	//方式三：设置方法自动装配,不一定是set方法
//	private ISystemDao<String> systemDaoImpl;

//	@Autowired
	@Override
	public void setDao(ISystemDaoImpl t) {
		systemDaoImpl = t;
	}
	
	public void saveData(String data){
		systemDaoImpl.saveData(data);
	}
	
}
