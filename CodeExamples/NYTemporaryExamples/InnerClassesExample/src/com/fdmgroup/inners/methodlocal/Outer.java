package com.fdmgroup.inners.methodlocal;

class CoolSuperclass{ 
	
	public void saySomething(String s) {
		
		System.out.println("hi");
	}
}

public class Outer {
	
	public void otherMethod(){
		
		class LocalInner {
			
			class Innerer {
				
			}
			
			int x = 1;
		}
		
	}
	
	public void otherOtherMethod(){
		class LocalInner {
			
		}
	}
	
	public CoolSuperclass someMethod(){
		
	    final int number = 16;
		final String flower = "tulip";
		
		class LocalInner extends CoolSuperclass{
			
			public String name = flower;
			public void specialLocalInnerMethod(){ }
			
			@Override
			public void saySomething(String something){
				
				// Can we use num or flower here?
				
				// String s = flower;
				int i = number;
			
				System.out.println(something);
			}
		}

		/* Can instantiate it the usual way, 
		   as long as it comes after class definition */
		
		LocalInner myInstance = new LocalInner();
		
		myInstance.saySomething(flower + " is a flower.");
		myInstance.saySomething(number + " is a number.");
		
		// What are the implications of returning a 
		// local inner class object?
		
		return myInstance;
		
	}

	public static void main(String[] args){
		
		new Outer().someMethod();
		
		CoolSuperclass cs = new Outer().someMethod();
		
		cs.saySomething("hello!");

	}

	
}
