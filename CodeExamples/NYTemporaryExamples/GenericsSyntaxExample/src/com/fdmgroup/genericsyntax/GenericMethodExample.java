package com.fdmgroup.genericsyntax;

import java.util.*;


public class GenericMethodExample {
 
	public <T> List<T> makeArrayList(T item) { 	
											// take an object of an
	                                    	// unknown type and use a
											// "T" to represent the type
	    List<T> list = new ArrayList<T>(); 	// now we can create the
	                                       	// list using "T"
	    list.add(item);
	    
	    return list;
	}
	
	
	public static void main(String[] args){
		
		GenericMethodExample gme = new GenericMethodExample();
		
		List<String> list = gme.makeArrayList(new String());
		
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