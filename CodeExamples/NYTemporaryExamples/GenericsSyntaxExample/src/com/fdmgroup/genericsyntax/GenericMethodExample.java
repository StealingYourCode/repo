package com.fdmgroup.genericsyntax;

import java.util.*;


public class GenericMethodExample {
	
	public <T> GenericMethodExample(){
		// TODO Look up why anyone would use this, ever, if ever	
	}
 
	public <T,Y> List<T> makeArrayList(T item) { 	
											// take an object of an
	                                    	// unknown type and use a
											// "T" to represent the type
	    List<T> list = new ArrayList<T>(); 	// now we can create the
	                                       	// list using "T"
	    
	    List<Y> otherList = new ArrayList<Y>(); // TODO Why are we allowed to do this?
	    
	    
	    System.out.println(otherList);
	    
	    list.add(item);
	    
	    return list;
	}
	
	
	public static void main(String[] args){
		
		GenericMethodExample gme = new GenericMethodExample();
		
		gme.makeArrayList(new Object());
	}
	
	
}



/* When invoked as: 
 
	  Dog dog = new Dog();
	  makeArrayList(dog);
  
  It will behave as if it was written as:

	
	public List<Dog> makeArrayList(Dog item) {
		
		List<Dog> list = new ArrayList<Dog>();
		list.add(item);
		return list;
	}
	
 	When invoked as:
 
	  Cat cat = new Cat();
	  makeArrayList(cat);

	It will behave as if it was written as:

	
	public List<Cat> makeArrayList(Cat item) {
		
		List<Cat> list = new ArrayList<Cat>();
		list.add(item);
		return list;
	}
	
	
	This is called "type erasure".

 */