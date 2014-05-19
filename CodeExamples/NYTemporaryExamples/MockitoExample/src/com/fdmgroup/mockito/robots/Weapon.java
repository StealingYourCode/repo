package com.fdmgroup.mockito.robots;


public class Weapon {
	public void fire(int power){
		for (int i = 0; i<power; i++)	
			System.out.println("Boom");
	}
}
