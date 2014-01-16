package com.fdmgroup.fundamentals;

import java.io.IOException;


public class OverloadingOverriding {

	public static void main(String[] args){
		
		Animal a = new Dog();
		
	}
	
}

class Animal {
	
	Object breathe() throws IOException{
		
		System.out.println("Animal breathing");
		return null;
	}
	
}


class Dog extends Animal {
	
	public Object breathe() {
		
		System.out.println("Breathing like a dog");
		return null;
	}
}	




	
// Rule #1: Return type of override can be 
//	a subtype of original return type

// Rule #2: Overrride must be at least as visible as 
//    original method.













