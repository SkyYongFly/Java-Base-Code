package com.example.utils;

/**
 * String ������
 * 
 * @author zhu
 */
public class StringUtil {
	/**
	 * �ж��ַ����Ƿ�Ϊ��
	 * 
	 * @param 	str	��Ҫ�жϵ��ַ���
	 * @return	Ϊ�գ�true ; �ǿ� ��false
	 */
	public static boolean isNullOrEmpty(String str){
		if(null == str || "" == str){
			return true;
		}
		
		return false;
	}
}
