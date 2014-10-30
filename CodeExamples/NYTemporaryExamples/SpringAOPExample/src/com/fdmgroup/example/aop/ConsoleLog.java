package com.fdmgroup.example.aop;



// ADVICE
public class ConsoleLog {
	
	public void logEntry()
	{
		System.out.println("Entering a method...");
	}
	
	public void logExitWork()
	{
		System.out.println("Exiting work()...");
	}
	
	public void logReturnUser(User returnedObject)
	{	
		System.out.println("User was returned: "+ returnedObject);
	}

//	public void displayReturnSecondException(Exception thrownException)
//	{
//		System.out.println("Log: User threw Exception: "+ 
//					thrownException.getClass().getSimpleName());
//	}
	
	
}
