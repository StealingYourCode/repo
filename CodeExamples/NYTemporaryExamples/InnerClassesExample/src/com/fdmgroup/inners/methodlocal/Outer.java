package com.fdmgroup.inners.methodlocal;

class Item { 
	
	public void saySomething(String s) {
		
		System.out.println("hi");
	}
}

public class Outer {
		
	public void someMethod(){
		
	    final int number = 16;
		final String flower = "tulip";
		
		class LocalInner extends Item {
			
			public String name = flower;
			public void specialLocalInnerMethod(){ }
			
			@Override
			public void saySomething(String something){
				
				// Can we use number or flower here?
				
				int i = number;
			
				System.out.println(something);
			}
		}

		/* Can instantiate it the usual way, 
		   as long as it comes after class definition */
		
		LocalInner myInstance = new LocalInner();
		
		myInstance.saySomething(flower + " is a flower.");
		myInstance.saySomething(number + " is a number.");
		
		// What if we return a local inner class object?
		
	}

	
	public void anotherMethod(){
		
		// What if this method has another local inner class
		// with the same name?
	}


	public static void main(String[] args){
		
		new Outer().someMethod();
		
	}

	
}
