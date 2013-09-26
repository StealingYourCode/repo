package com.fdmgroup.animal;

/**
 * The job of this factory is to genrate something that moves
 * @author shoshana.kesselman
 */
public class MoverFactory 
{
	public static IMover createMover(int selection)
	{		
		switch(selection){
		case 1:
			return new Fish();
		case 2:
			return new Reptile();
		default:
			return new Mammal();
		}
	}
}
