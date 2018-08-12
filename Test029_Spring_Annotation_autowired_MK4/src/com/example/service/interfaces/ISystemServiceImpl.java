package com.example.service.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.interfaces.ISystemDao;
import com.example.dao.interfaces.ISystemDaoImpl;

@Service("iSystemServiceImpl")
public class ISystemServiceImpl implements ISystemService<ISystemDaoImpl>{
	//��ʽһ�����ó�Ա�����Զ�װ��
//	@Autowired
//	private ISystemDao<String> systemDaoImpl;
	
	
	//��ʽ�������ù��췽���Զ�װ��
	private ISystemDao<String> systemDaoImpl;
	
	@Autowired
	public ISystemServiceImpl(ISystemDao<String> iSystemDao) {
		systemDaoImpl = iSystemDao;
	}
	
	
	//��ʽ�������÷����Զ�װ��,��һ����set����
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
