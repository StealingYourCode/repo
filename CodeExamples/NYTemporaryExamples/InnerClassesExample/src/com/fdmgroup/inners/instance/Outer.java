package com.fdmgroup.inners.instance;


public class Outer {

	private String password = "outer password";
	
	public void go(){
		// we have an instance of Outer
		// we can access it with "this"
		Inner i = new Inner();
	}
	
	public static void staticGo(){

		Inner i = new Outer().new Inner();
	}	
	

	public class Inner {
		
		private String innerPassword = "password";
		
		// Cannot have static members unless they are constants!
		//public static String specialStuff = "coffee";
		
		
		
		public void innerGo(){
			
			// Outer's static method			
			staticGo();
			
			// Outer's instance method
			go();
			
			// Outer's instance variable
			System.out.println(password);
			
			// Outer's instance variable through 
			// "Outer.this" reference 
			Outer.this.password = "";
			
			// "this" refers to inner instance
			this.innerPassword = "";
			
		}
		
	}	

}


class SomeOtherClass {  
	
	public void otherGo(){
		
		// Creating instance of inner from anywhere else
		Outer.Inner inner1 = new Outer().new Inner();
		
		Outer myOuter = new Outer();
		Outer.Inner inner2 = myOuter.new Inner();
		
		inner2.innerGo();
		
		// Can have multiple inner instances associated
		// with one outer instance
		
		Outer.Inner inner3 = myOuter.new Inner();
		
	}
}















