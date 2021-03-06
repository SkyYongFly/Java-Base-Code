package com.example.factory;

import com.example.bean.Phone;
import com.example.beanimpl.AndroidPhone;
import com.example.beanimpl.ApplePhone;
import com.example.beanimpl.WinPhone;

/**
 * ʵ������
 * @author zhu
 */
public class InstFactory {

	public Phone makePhone(String type){
		if("windows".equals(type)){
			return new WinPhone();
		}else if("android".equals(type)){
			return new AndroidPhone();
		}else{
			return new ApplePhone();
		}
	}
}
