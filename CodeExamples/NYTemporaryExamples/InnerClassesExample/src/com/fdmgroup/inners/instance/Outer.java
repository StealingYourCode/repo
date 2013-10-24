package com.fdmgroup.inners.instance;


public class Outer {

	private String password = "outer password !!!";
	
	public void go(){
		
		// Creating an instance of inner from instance of outer
		Inner i = new Inner();
		

	}
	
	
	// INNER CLASS
	public class Inner {
		
		private String innerPassword = "password";
		
		// THIS FAILS
		// public static String specialStuff = "coffee";
		
		
		public void innerGo(){
			
			System.out.println(password);
			
			// Outer instance this inner instance is member of
			Outer.this.password = "";
			
			// "this" keyword refers to inner instance
			this.innerPassword = "";
		}
		
	}
	
	// INNER CLASS END
	
	
	public static void staticGo(){

		// Creating instance of inner from static context
		Outer.Inner i = new Outer().new Inner();
		
	}	
}


class SomeOtherClass {  
	
	public void otherGo(){
		
		// Creating instance of inner from anywhere else
		Outer.Inner i = new Outer().new Inner();
		
		
		Outer myOuter = new Outer();
		
		// code
		
		// more code
		
		Outer.Inner myInner = myOuter.new Inner();
		
		//myOuter = null;
		myInner.innerGo();
		
		Outer.Inner myOtherInner = myOuter.new Inner();
		
		
	}
}















