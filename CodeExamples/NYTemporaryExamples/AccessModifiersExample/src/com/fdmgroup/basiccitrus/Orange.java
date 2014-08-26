package com.fdmgroup.basiccitrus;

// A basic class with two protected members 
// and one private member.
public class Orange {
	
	private String privateHello = "hello self";
	
	String defaultString = "hello package";
	
	protected String protectedString = "hello package and subclasses*";

	protected void printOrange(){
		
		System.out.println("This is an orange.");
	}
	
}


