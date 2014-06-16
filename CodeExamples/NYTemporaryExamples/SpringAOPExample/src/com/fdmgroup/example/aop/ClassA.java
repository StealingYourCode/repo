package com.fdmgroup.example.aop;

public class ClassA {

	public void method1()
	{
		System.out.println("Class A method1 action.");

	}

	public int method2()
	{
		System.out.println("Class A method2 action.");
		return 1;
	}
	
	
	public int method2(int x)
	{
		System.out.println("Class A method2 WITH ARG action.");		
		return 1;
	}
	

	public ClassB getBInstance()
	{
		System.out.println("Class A: Creating Class B!");
		return new ClassB();
	}


}
