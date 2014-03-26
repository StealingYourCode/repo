package com.fdmgroup.inners.methodlocal;

class Item { 
	
	public void saySomething(String s) {
		System.out.println("hi");
	}
}

public class Outer {
		
	public Item someMethod(){
		
		class LocalInner extends Item {
			
			public void go(){
				//some stuff
			}
			
			@Override
			public void saySomething(String something){
				System.out.println(something);
			}
		}
		
		/* Can instantiate it the usual way, 
		   as long as it comes after class definition */
		
		LocalInner myInstance = new LocalInner();
		myInstance.saySomething("hello");
		
		return myInstance;
		
	}

	
	public void anotherMethod(){
		
		// What if this method has another local inner class
		// with the same name?
	}


	public static void main(String[] args){
		
		Item myItem = new Outer().someMethod();
		
	}

	
}
