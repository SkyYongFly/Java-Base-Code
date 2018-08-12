package com.example.dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Transaction {
	/*
	 * 前置通知，在目标方法执行之前
	 * 参数：连接点
	 */
	public void beginTransaction(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("连接点的名称："+methodName);
		System.out.println("目标类："+joinPoint.getTarget().getClass());
		System.out.println("begin transaction");
	}
	
	/*
	 * 后置通知：在目标方法执行之后
	 */
	public void commit(JoinPoint joinPoint,Object val){
		System.out.println("目标方法返回值是："+val);
		System.out.println("commit");
	}
	
	/*
	 * 最终通知
	 */
	public void finallyMethod(){
		System.out.println("finally method");
	}
	
	/*
	 * 异常通知
	 */
	public void throwingMethod(JoinPoint joinPoint,Throwable throwable){
		System.err.println("产生异常信息：" + throwable.getMessage());
	}
	
	/*
	 * 环绕通知：控制目标方法的执行
	 * joinPoint.proceed();这个代码如果在环绕通知中不写，则目标方法不再执行
	 */
	public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕通知");
		joinPoint.proceed();//调用目标方法
	}
}
