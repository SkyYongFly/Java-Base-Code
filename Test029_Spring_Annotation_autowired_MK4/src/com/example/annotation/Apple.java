package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * �Զ���ע��
 * 
 * Target�����ע�����Ӧ�õĶ���
 * Retention��ע��ע���ĸ�ʱ�ڲ������� 
 * 
 * @author zhu
 */
@Target({ElementType.METHOD, ElementType.TYPE ,
		ElementType.FIELD , ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Apple {

}
