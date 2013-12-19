package com.fdmgroup.java.designpatterns;


class Dog {  } 

class GermanShepherd extends Dog {  }

class Poodle extends Dog {  }

// This is the Factory pattern
class DogFactory {   
	
	Poodle makePoodle(){
		return new Poodle();
	}
	
	GermanShepherd makeGermanShepherd(){
		return new GermanShepherd();
	}
}


// This is the Factory Method pattern
abstract class DogFactoryMethod{  
	abstract Dog makeDog();
}

class PoodleCreator extends DogFactoryMethod{ 
	Dog makeDog(){
		return new Poodle();
	}
}

class GermanShepherdCreator extends DogFactoryMethod{ 
	Dog makeDog(){
		return new GermanShepherd();
	}
}

public class FactoryFactoryMethodExample {

	private static Dog myDog; 

	
	public static void main(String[] args) {
		// Factory
		myDog = new DogFactory().makePoodle();
		
		// Factory Method
		myDog = new PoodleCreator().makeDog();
		
	}

}
