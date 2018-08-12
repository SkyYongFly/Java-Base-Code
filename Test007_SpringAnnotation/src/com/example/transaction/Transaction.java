package com.example.transaction;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("transaction")
@Aspect
public class Transaction {
	@Pointcut("execution (* com.example.transaction.PersonDaoImpl.*(..))")
	private void point(){}//����ǩ����ָ��Ŀ���෽��
	
	@Before("point()")
	public void beginTransaction(){
		System.out.println("begin transaction");
	}
	
	@AfterReturning("point()")
	public void commit(){
		System.out.println("transaction commit");
	}

}
