
package com.fdmgroup.example.aop;

public class Second {

	public void methodA()
	{
		System.out.println("Second: methodA action.");
	}
	
	
	public void methodB()
	{
		System.out.println("Second: methodB action.");
		
	}
	
	
	public Second getInstance()
	{
		System.out.println("Second: Creating Second!");
		return new Second();
	}
}
