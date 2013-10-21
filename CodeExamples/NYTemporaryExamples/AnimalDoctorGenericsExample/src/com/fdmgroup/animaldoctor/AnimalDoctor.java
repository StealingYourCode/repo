package com.fdmgroup.animaldoctor;


public class AnimalDoctor {
	
	/* Polymorphic method */
	
	public void checkAnimal(Animal a) {
	     a.checkup(); // does not matter which animal subtype each
	                  // Animal's overridden checkup() method runs
	}
	
	 
	public void checkAnimals(Animal[] animals) {
        for(Animal a : animals) {
          checkAnimal(a);
        }
    } 
    
	
    public void addAnimal(Animal[] animals) {
        animals[0] = new Cat();  // no problem, any Animal works
                                 // in Animal[]
    }
    
    public static void main(String[] args) {
       
    	// test it
       Dog[] dogs = {new Dog(), new Dog()};
       Cat[] cats = {new Cat(), new Cat(), new Cat()};
       Bird[] birds = {new Bird()};

       AnimalDoctor doc = new AnimalDoctor();
       
       doc.checkAnimals(dogs);  // pass the Dog[]
       doc.checkAnimals(cats);  // pass the Cat[]
       doc.checkAnimals(birds); // pass the Bird[]
       
       doc.addAnimal(dogs);
    }
    
    
    
    


	
}
