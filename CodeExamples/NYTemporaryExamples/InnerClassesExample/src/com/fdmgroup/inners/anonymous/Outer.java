package com.fdmgroup.inners.anonymous;

abstract class Popcorn {
	  
	public void pop() {
		System.out.println("standard popcorn");
	}
}


public class Outer {
		
	static void popSomeCorn(Popcorn p) { /* Regular method */ }
	
	public static void main(String[] args) {
				
		/* Popcorn reference to an instance of an anonymous 
		   subclass of Popcorn: */
		Popcorn p1 = new Popcorn() {  };
		
		Popcorn p = new Popcorn(){


			// Note that will never be able to access this 
			// method from outside of the class
			public void coolMethod() {
				// does things
			}
			
			@Override
		    public void pop() {
		    	// We can use a helper method
		    	coolMethod();
		        System.out.println("anonymous popcorn");
		    }


		};	
		
		 popSomeCorn(p);
		 p.pop();
		 

		// Passing an anon inner class object 
		// into a method argument:
		 
		popSomeCorn(
			new Popcorn(){
				public void pop() { // override
				}
				public void cook(){ }
			}
		);
		

	}
}

/* Can we do the same with an interface? */

//interface Cookable {
//	
// public void cook();	
//}
