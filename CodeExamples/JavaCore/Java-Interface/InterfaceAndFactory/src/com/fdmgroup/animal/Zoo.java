package com.fdmgroup.animal;

import java.util.Random;

public class Zoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/* Without a factory, if I want to generate something
		 * that has movement, we have to generate each kind 
		 * of animal manually. */ 
		 
		IMover animal1 = new Reptile();
		animal1.move();
		
		
		
		/* The above is problematic because we have hard coded
		 * Reptile into this class. When requirements change later,
		 * this class will have to change too.*/
		
		/* But with a factory, I can more effectively code to the 
		 * interface.  I have no idea what kind of IMover I have. 
		 * I only know that it is guaranteed to be an object with
		 * the method move()*/
		
		Random ran = new Random();
		
		IMover mover = MoverFactory.createMover(ran.nextInt(3));
		mover.move();
			
	}

}
