
package com.fdmgroup.example.aop;

import java.io.IOException;

public class ClassB {

	public void method1()
	{
		System.out.println("Class B method1 action.");
	}
	
	
	public void method2()
	{
		System.out.println("Class B method2 action.");
		
	}
	
	
	public ClassB getInstance() throws IOException
	{
		System.out.println("Class B: Creating Class B!");
		
		if(true)
			throw new IOException();
		
		return new ClassB();
		
	}
}
