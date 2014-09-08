package com.fdmgroup.example.aop;

public class First {

	public void methodA()
	{
		System.out.println("First: methodA action.");
	}

	public int methodB()
	{
		System.out.println("First: methodB action.");
		return 1;
	}
	
	
	public int methodB(int x)
	{
		System.out.println("First: methodB WITH ARG action.");		
		return 1;
	}
	

	public Second getSecondInstance()
	{
		System.out.println("First: Creating Second!");
		return new Second();
	}


}
