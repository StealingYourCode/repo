package com.fdmgroup.example.aop;


// ADVICE
public class ConsoleLog {

	
	public void displayEntry()
	{
		System.out.println("Log: Entering a method...");
	}
	
	public void displayEntryMethod2()
	{
		System.out.println("Log: Entering a method2...");
	}
	

	public void displayReturnClassB()
	{
	
		System.out.println("Log: Class B was returned.");

	}
	
}
