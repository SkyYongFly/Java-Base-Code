package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 自定义注解
 * 
 * Target定义该注解可以应用的对象
 * Retention标注该注解哪个时期产生作用 
 * 
 * @author zhu
 */
@Target({ElementType.METHOD, ElementType.TYPE ,
		ElementType.FIELD , ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Apple {

}
