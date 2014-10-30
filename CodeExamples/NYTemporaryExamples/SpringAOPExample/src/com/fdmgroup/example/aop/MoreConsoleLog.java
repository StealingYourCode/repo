package com.fdmgroup.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public interface MoreConsoleLog {
	
	@Pointcut("execution(* *(..))")
	 void everything();
	
	@Pointcut("execution(* work(..))")
	 void anyWork();
	
	@Pointcut("execution(com.fdmgroup.example.aop.User com.fdmgroup.example.aop.User.*(..))")
	 void returningUserInUser();
	
	@Pointcut("execution(com.fdmgroup.example.aop.User com.fdmgroup.example.aop.*.*(..))")
	void returningUserInAopPackage();
	

}
