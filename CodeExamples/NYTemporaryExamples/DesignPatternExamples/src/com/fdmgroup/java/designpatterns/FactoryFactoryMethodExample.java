package com.fdmgroup.java.designpatterns;


class Dog {  } 

class GermanShepherd extends Dog {  }

class Poodle extends Dog {  }

// This is the Factory pattern
// class DogCreator {   
//	
//	Dog makeDog(int x){
//		if (x == 0)
//			return new Poodle();
//		else
//			return new GermanShepherd();
//	}
//	
//}


// This is the Factory Method pattern
abstract class DogCreator{  
	abstract Dog makeDog();
}

class PoodleCreator extends DogCreator{ 
	Dog makeDog(){
		return new Poodle();
	}
}

class GermanShepherdCreator extends DogCreator{ 
	Dog makeDog(){
		return new GermanShepherd();
	}
}

public class FactoryFactoryMethodExample {

	private static Dog myDog; 
	
	private static void doDogThings(){
		// do something with myDog
		myDog.toString();
	}
	

	
	public static void main(String[] args) {
		// Factory
		// myDog = new DogCreator().makeDog(6);
		
		// Factory Method
		myDog = new PoodleCreator().makeDog();
		
	}

}
