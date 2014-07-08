package com.fdmgroup.genericsyntax;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {

	void makeNoise() {	}

	void breathe() {  }

	void eat() {  }
}

class Dog extends Animal {}

class Cat extends Animal {}

class Person extends Animal {}

class Superman extends Person implements Flier {}

interface Flier {}

// Shows an upper bound
class AnimalDoctor<T extends Animal> {

	List<T>	waitingList	= new ArrayList<T>();

	public void examine() {

		for (T patient : waitingList) {
			patient.breathe();
			patient.makeNoise();
			patient.eat();
		}
	}
}


class ArrayAnimalDoctor {
	
	public void addAnimal(Animal[] a){
	      a[0] = new Cat();
	}

}


public class BoundsExample {


	public static void main(String[] args) {

		ArrayAnimalDoctor doctor = new ArrayAnimalDoctor();
		
		Dog[] dogArray = new Dog[3];
		
		doctor.addAnimal(dogArray);
		
	}

}





