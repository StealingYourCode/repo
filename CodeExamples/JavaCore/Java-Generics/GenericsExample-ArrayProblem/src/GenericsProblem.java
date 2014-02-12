/* Demonstrate that with Arrays we can say Animal[] a = new Cat[5];
 * Demonstrate that with generics the generic type on the left hand 
 * side of the = must be the same as the generic type on the right.
 * 
 * Show that we can write code that will attempt to add a Dog to 
 * our Cat array and IT WILL COMPILE - however, we will get an 
 * exception at runtime. 
 * 
 * With generics however, if we try to add a Dog to a collection of
 * cats, it will not even compile. 
 * 
 * */
import java.util.ArrayList;
import java.util.List;


class Animal{}

class Dog extends Animal {}

class Cat extends Animal {}

public class GenericsProblem 
{
	public static void main(String[] args)
	{
		GenericsProblem problem = new GenericsProblem();
		
		Cat[] cats = {new Cat(), new Cat()};
//		problem.addAnimal(cats);    //See that if you execute this line, it will crash 
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());		
		problem.addAnimal(animals);
	}
	
	public void addAnimal(Animal[] animals)
	{
		/*See that our array holds only cats. 
		  But once we send it to the addAnimal method, the compiler
		  lets us add a Dog to our Cat array. 
		  When we run it, it will crash. 
		*/
		animals[0] = new Dog(); //You'll get an ArrayStoreException
	}
	
	public void addAnimal(List<Animal> animals)
	{
		animals.add(new Dog());
	}
}

