package com.fdm.factoryMethod;

public class TriangleFactory implements ShapeFactory{
	
	public Shape create(){
		return new Triangle();
	}

}
