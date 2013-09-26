package com.fdmgroup.generics;

import java.util.ArrayList;

public interface iSalad<T extends Food>
{
	public void add(T food);
	public ArrayList<T> serve();
}

