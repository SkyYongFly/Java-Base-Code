package com.example.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * ��־������
 * ע�����ʹ�� @Component ע���������˶���Ϊ bean������spring��������
 * ֻʹ��  @Aspect����Ч��
 */
@Component
@Aspect 
public class LogManager {
	
	/**
	 * ���������
	 */
	@Pointcut("execution  (* com.example.bean.*Dao.*(..))")
	private void myPointCut(){
		
	}
	
	@Around("myPointCut()")
	public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("��������֪ͨ...");
		Object result =  joinPoint.proceed();
		System.out.println("��������֪ͨ...");
		
		return result;
	}
	
	/**
	 * ��־AOPǰ�ô���
	 */
	@Before("myPointCut()")
	public void startLog(){
		System.out.println("������־��¼����...");
	}
	
	@AfterReturning(pointcut="execution (* com.example.bean.*Dao.get*(..))",returning="object")
	public void saveGetedData(Object object){
		System.out.println("��¼��ȡ��������:"+ object);
	}
	
	@AfterThrowing(pointcut="myPointCut()",throwing="tx")
	public void doException(Throwable tx){
		System.out.println("�������쳣��");
	}
	
	@After("myPointCut()")
	public void endLog(){
		System.out.println("������־��¼����...");
	}

}
