package com.fdmgroup.genericsyntax;

import java.util.ArrayList;
import java.util.List;


class Animal {
	
	void cry(){}
	void makeNoise(){}
	void breathe(){}
	void eat(){}
}
class Dog extends Animal {}
class Cat extends Animal {}
class Person{}


// Shows an upper bound
class AnimalDoctor<T extends Animal> {
	
	List<T> waitingList = new ArrayList<T>();
	
	public void examine(){
		for(T patient : waitingList){
			patient.breathe();
			patient.cry();
			patient.eat();
		}	
	}	
}

public class BoundsExample {

	
	// Another strange method
	public static <A extends AnimalDoctor<? super Dog>> A walk(A animalDoctor){
		animalDoctor.waitingList.add(new Dog());
		return animalDoctor;
	}
	
	public static void main(String[] args) {

//		AnimalDoctor<Dog> dogDoctor = new AnimalDoctor<Dog>();
//						  dogDoctor = new AnimalDoctor<Cat>();
//		AnimalDoctor<?> anyDoctor = new AnimalDoctor<Cat>();	
//						anyDoctor = new AnimalDoctor<Dog>();

		AnimalDoctor<Dog> x = walk(new AnimalDoctor<Dog>());


		
		
		// This reference can point to a list of elements of any type
		List<?> myList = new ArrayList<Cat>();
		myList = new ArrayList<Dog>();
		myList = new ArrayList<Float>();
		myList = new ArrayList<Object>();
	
		// Add doesn't work. Why not?
		// myList.add(new Dog());
		
		
		// This reference can ONLY point to ArrayList of Objects
		List<Object> myList2 = new ArrayList<Object>();
		
		
		
	}

}
