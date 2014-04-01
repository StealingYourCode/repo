package com.fdmgroup.serial4;

import java.io.Serializable;

/*Note that this version of Animal is serializable.*/

public class Animal  implements Serializable
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