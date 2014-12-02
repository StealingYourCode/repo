package com.fdmgroup.fundamentals;


public class AssertExample {
	
	public static void main(String[] args){
		
		int myFive;
		
		// We know this variable SHOULD hold a five
		myFive = getFive();
		
		assert(myFive == 5);
		
		System.out.println("Life is good.");
		
	}
	
	public static int getFive(){
		
		// Evil code!
		return 4;
	}
	
}
