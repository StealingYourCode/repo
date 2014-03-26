package com.fdmgroup.inners.instance;


public class Outer {

	private String password = "outer password";
	
	public void go(){
		
		Inner i = new Inner();
	}
	
	public static void staticGo(){

		Inner i = new Outer().new Inner();
		
	}	
	
	
	public class Inner {
		
		private String innerPassword = "password";
		
		// Cannot have static members unless they are constants!
		// public static String specialStuff = "coffee";
		
		public void innerGo(){
			
			staticGo();
			
			go();
			
			System.out.println(password);
			
			// Outer.this refers to the associated Outer instance
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















