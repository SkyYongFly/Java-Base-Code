package com.example.utils;

/**
 * String 基础类
 * 
 * @author zhu
 */
public class StringUtil {
	/**
	 * 判断字符串是否为空
	 * 
	 * @param 	str	需要判断的字符串
	 * @return	为空：true ; 非空 ：false
	 */
	public static boolean isNullOrEmpty(String str){
		if(null == str || "" == str){
			return true;
		}
		
		return false;
	}
}
