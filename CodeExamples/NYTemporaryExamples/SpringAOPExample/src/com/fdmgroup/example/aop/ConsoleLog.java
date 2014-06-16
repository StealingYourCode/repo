package com.fdmgroup.example.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// ADVICE

@Aspect
/* This code handles the Logging aspect */
public class ConsoleLog {

	@Pointcut ("execution(* *(..))")
	public void mySpecialPointcut() {

	}

	@Around ("mySpecialPointcut()")
	public void displayEntry(Joinpoint joinPoint) throws Throwable {

		//System.out.println("Log: Entering a method...");
		
		System.out.println("Before invocation...");
		joinPoint.proceed();
		System.out.println("After invocation.");
	}
	//
	// @After("mySpecialPointcut()")
	// public void displayEntryMethod2()
	// {
	// System.out.println("Log: Entering a method2...");
	// 

	// @AfterReturning(pointcut="execution(com.fdmgroup.example.aop.ClassB *.*(..))",
	// returning="returnedB")
	// public void displayGetInstanceClassB(ClassB returnedB)
	// {
	// System.out.println("A ClassB instance was returned!");
	// System.out.println(returnedB.toString());
	// }
	//
	// @AfterThrowing (pointcut =
	// "execution(com.fdmgroup.example.aop.ClassB *.*(..))", throwing =
	// "thrownE")
	// public void displayGetInstanceClassB(Exception thrownE) {
	//
	// System.out.println("Nothing was returned!");
	// thrownE.printStackTrace();
	// }

}
