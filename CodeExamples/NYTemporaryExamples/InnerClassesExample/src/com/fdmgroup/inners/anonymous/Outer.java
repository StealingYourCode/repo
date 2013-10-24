package com.fdmgroup.inners.anonymous;

abstract class Popcorn {
	  
	public void pop() {
		System.out.println("standard popcorn");
	}


}


public class Outer {
		
	static void popSomeCorn(Popcorn p) { /* do things */ }
	
	public static void main(String[] args) {
				
		/* Popcorn reference to an instance of a 
		   subclass of Popcorn: */
		
		Popcorn p1 = new Popcorn() {  };
		
		
		Popcorn p = new Popcorn(){


			// Note that will never be able to access this 
			// method from outside of the class, so you can
			// only put helper methods in anon inner classes.
			public void coolMethod() {
				// does things
			}
			
			@Override
		    public void pop() {
		    	
		    	coolMethod();
		        System.out.println("anonymous popcorn");
		    }


		};	
		
		 popSomeCorn(p);
		 p.pop();
		 
		

		// Passing an anon inner class object 
		// into a method argument
		
		popSomeCorn(
			new Popcorn(){
				public void pop() { // special implementation
				}
				public void cook(){}
			}
		);
		

	}
}


//
//
//interface Cookable {
//	
//	public void cook();
//	
//	
//	
//}
//
//	//cookSomething(p);
//	
//	
//	/* Cookable reference to an instance of a
//	   class implementing Cookable: */
//	 
//	Cookable c = new Cookable() {
//		
//		public void clean(){}
//		
//	    public void cook() {
//	        System.out.println("anonymous cookable implementer");
//	     }
//	};
//	
//	cookSomething(c);	
//	c.cook();
//
//
//
//cookSomething( 
//		new Cookable(){
//			public void cook(){ // special implementation
//			}
//		});
