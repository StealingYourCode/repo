package com.fdmgroup.examples;

public class ParentClass {
	public ParentClass(){
		
		System.out.println("Parent's Constructor!");
	}
	public static void main(String[] args){
		System.out.println("Before first instance");
		new MyClass();
		System.out.println("Before second instance");
		new MyClass();
	}
	
}

class MyClass extends ParentClass{

	
	public MyClass(){
		
		System.out.println("Constructor!");
	}

	{
		System.out.println("Instance anon code block!");
	}


	static {
		System.out.println("Static anon code block!");
	}
}
