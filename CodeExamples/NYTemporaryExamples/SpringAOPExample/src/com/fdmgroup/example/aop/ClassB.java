
package com.fdmgroup.example.aop;

public class ClassB {

	public void method1()
	{
		System.out.println("Class B method1 action.");
	}
	
	
	public void method2()
	{
		System.out.println("Class B method2 action.");
		
	}
	
	
	public ClassB getInstance()
	{
		System.out.println("Class B: Creating Class B!");
		return new ClassB();
	}
}
