package com.fdmgroup.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@org.aspectj.lang.annotation.Aspect
public class ConsoleLog {

	
	@Pointcut("execution(* *(..))")
	private void everything(){}
	
	@Pointcut("execution(* work(..))")
	private void anyWork(){}
	
	@Pointcut("execution(com.fdmgroup.example.aop.User com.fdmgroup.example.aop.User.*(..))")
	private void returningUserInUser(){}
	
	@Pointcut("execution(com.fdmgroup.example.aop.User com.fdmgroup.example.aop.*.*(..))")
	private void returningUserInAopPackage(){}
	
	@Before("everything()")
	private void logEntry(JoinPoint joinPoint) {

		Object target = joinPoint.getTarget();
		System.out.println("Entering a method in..." + target);
		if (target instanceof User)
			System.out.println("The user's name is "
					+ ((User) target).getName());
	}

	
	@After("execution(* *(int))")
	private void logIntArg(JoinPoint joinPoint){
		System.out.println("Exiting a method that was passed an int argument: "
				+ joinPoint.getArgs()[0]);
		
		((UserFactory)(joinPoint.getTarget())).operate(18);
	}
	
	@After("anyWork()")
	public void logExitWork() {

		System.out.println("Exiting work()...");
	}
	
	@Before("everything()")
	@AfterReturning("returningUserInUser() || anyWork()")
	private void logNothingness(){
		System.out.println("...");
	}
	
	
	@AfterReturning(pointcut="returningUserInUser()", returning="returnedObject")
	public void logReturnUser(User returnedObject) {

		System.out.println("User "+returnedObject.getName()+" was returned.");
		System.out.println(returnedObject.getName()+" says "+returnedObject.getMessage());
	}


	@AfterThrowing(pointcut="returningUserInUser()", throwing="thrownExc")
	public void logExcThrown(NullPointerException thrownExc) {

		System.out.println("An exception was thrown.");
		System.out.println("It was a "+thrownExc.getClass().getSimpleName()+"!!!");
		
		
	}	

	
	@Around("execution(* play(..))")
	private void logAroundPlay(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("Before execution!");
		
		Object[] arrgs = new Object[1];
		arrgs[0] = 1900.5;
		joinPoint.proceed(arrgs);
		
		System.out.println("After execution!");
	}
	
	
	
	
	
	
	



	
	

	

}
