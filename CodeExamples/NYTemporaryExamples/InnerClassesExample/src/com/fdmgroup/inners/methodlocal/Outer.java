package com.fdmgroup.inners.methodlocal;

interface Item { 
	
	public void saySomething();
}

public class Outer {
		
	public Item someMethod(){
		
		// local to someMethod()
		int x = 3;
		
		class LocalInner implements Item {
			public void hello(){
				// helper
			}
			
			public void saySomething() {
				
				hello();
				System.out.println("Hi from LocalInner!");
			}
			
		}
		
		/* Can instantiate it the usual way, 
		   as long as it comes after class definition */
		
		LocalInner myInstance = new LocalInner();
		myInstance.saySomething();
		
		return myInstance;
		
	}

	
	public void anotherMethod(){
		
		// What if this method has another local inner class
		// with the same name?
		
		class LocalInner {
			
		}
	
	}


	public static void main(String[] args){
		
		Item item = new Outer().someMethod();
		item.saySomething();
		
	}

	
}
