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
 * 日志管理类
 * 注意必须使用 @Component 注解来声明此对象为 bean，以让spring容器发现
 * 只使用  @Aspect是无效的
 */
@Component
@Aspect 
public class LogManager {
	
	/**
	 * 定义切入点
	 */
	@Pointcut("execution  (* com.example.bean.*Dao.*(..))")
	private void myPointCut(){
		
	}
	
	@Around("myPointCut()")
	public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("开启环绕通知...");
		Object result =  joinPoint.proceed();
		System.out.println("结束环绕通知...");
		
		return result;
	}
	
	/**
	 * 日志AOP前置处理
	 */
	@Before("myPointCut()")
	public void startLog(){
		System.out.println("开启日志记录功能...");
	}
	
	@AfterReturning(pointcut="execution (* com.example.bean.*Dao.get*(..))",returning="object")
	public void saveGetedData(Object object){
		System.out.println("记录获取到得数据:"+ object);
	}
	
	@AfterThrowing(pointcut="myPointCut()",throwing="tx")
	public void doException(Throwable tx){
		System.out.println("产生了异常！");
	}
	
	@After("myPointCut()")
	public void endLog(){
		System.out.println("结束日志记录功能...");
	}

}
