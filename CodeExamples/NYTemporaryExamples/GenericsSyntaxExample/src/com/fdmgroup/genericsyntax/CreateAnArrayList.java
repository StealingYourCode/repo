package com.fdmgroup.genericsyntax;

import java.util.*;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class CreateAnArrayList {
	
 
	public <T extends Animal> List<T> makeArrayList(T t) { 	// take an object of an
	                                    	// unknown type and use a
	    // animal processing                    	// "T" to represent the type
	    List<T> list = new ArrayList<T>(); 	// now we can create the
	                                       	// list using "T"
	    list.add(t);
	    
	    return list;
	}
	
//	
//	public Dog makeArrayList(Dog t) {
//		
//		List<Dog> list = new ArrayList<Dog>();
//		list.add(t);
//		return list.get(0);
//	}
	
   

}



/* When invoked as: 
 
  Dog dog = new Dog();
  makeArrayList(dog);
  
  Cat cat = new Cat();
  makeArrayList(cat);
  
  It will behave as if it was written as:
 
 
 	public void makeArrayList(Dog t) {
 
	   List<Dog> list = new ArrayList<Dog>();
	   list.add(t);
	   

	}
	
	
	This is called "type erasure".

 */