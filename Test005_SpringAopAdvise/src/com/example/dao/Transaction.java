package com.example.dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Transaction {
	/*
	 * ǰ��֪ͨ����Ŀ�귽��ִ��֮ǰ
	 * ���������ӵ�
	 */
	public void beginTransaction(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("���ӵ�����ƣ�"+methodName);
		System.out.println("Ŀ���ࣺ"+joinPoint.getTarget().getClass());
		System.out.println("begin transaction");
	}
	
	/*
	 * ����֪ͨ����Ŀ�귽��ִ��֮��
	 */
	public void commit(JoinPoint joinPoint,Object val){
		System.out.println("Ŀ�귽������ֵ�ǣ�"+val);
		System.out.println("commit");
	}
	
	/*
	 * ����֪ͨ
	 */
	public void finallyMethod(){
		System.out.println("finally method");
	}
	
	/*
	 * �쳣֪ͨ
	 */
	public void throwingMethod(JoinPoint joinPoint,Throwable throwable){
		System.err.println("�����쳣��Ϣ��" + throwable.getMessage());
	}
	
	/*
	 * ����֪ͨ������Ŀ�귽����ִ��
	 * joinPoint.proceed();�����������ڻ���֪ͨ�в�д����Ŀ�귽������ִ��
	 */
	public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("����֪ͨ");
		joinPoint.proceed();//����Ŀ�귽��
	}
}
