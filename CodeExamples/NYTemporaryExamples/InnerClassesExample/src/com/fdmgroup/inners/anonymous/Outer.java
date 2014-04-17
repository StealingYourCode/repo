package com.fdmgroup.inners.anonymous;

abstract class Popcorn {
	  
	public void pop() {
		System.out.println("standard popcorn");
	}
}


public class Outer {
		
	static void popSomeCorn(Popcorn p) { /* This method takes 
											a popcorn object */ }
	
	public static void main(String[] args) {
				

		Popcorn p = new Popcorn() {

			@Override
		    public void pop() {

		        System.out.println("anonymous popcorn");
		    }
			
			// Can we have other methods here?

		};	
		
		
		
		 popSomeCorn(p);
		 p.pop();
		 
		 
		
		 
		 // What if we have an anon inner class 
		 // that doesn't override any methods?

		 
		 
		 Popcorn p2 = new Popcorn(){};
		 p2.pop();
		 
		 // Passing an anon inner class object 
		 // directly into a method argument:
		 
		
		 
		 popSomeCorn(
			new Popcorn(){
				public void pop() { // override
				}				
			}
		);	
		
		 
		Cookable cookable = new Cookable(){ 
			public void cook(){
				//give cook() a body
			}
			
		};
		 
	}
}

/* Can we do the same with an interface? */

interface Cookable {
	
	public void cook();	
}












