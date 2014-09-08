package com.fdmgroup.example.aop;


// ADVICE
public class ConsoleLog {

	
	public void displayEntry()
	{
		System.out.println("Log: Entering a method...");
	}
	
	public void displayEntryMethodB()
	{
		System.out.println("Log: Entering a methodB...");
	}
	

	public void displayReturnSecond()
	{
	
		System.out.println("Log: Second was returned.");

	}
	
}
