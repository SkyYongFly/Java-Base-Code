package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * ≤‚ ‘service
 * @author zhu
 *
 */
@org.springframework.stereotype.Service
public class DataService implements Service{
	
	@Autowired
	private Dao dataDao;
	
	@Override
	public void insertData(Object object) {
		dataDao.insertData(object);
	}

	@Override
	public Object getData() {
		return dataDao.getData();
	}
	
}
