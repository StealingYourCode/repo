package com.fdmgroup.serial4;

/*Note that this version of Animal is NOT serializable. 
 * It is also the superclass of Mammal, which IS serializable.*/

public class Animal 
{
	private String name;
	
	Animal(String n)
	{
		name = n;
	}

	Animal()
	{
		name = "unassigned";
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}