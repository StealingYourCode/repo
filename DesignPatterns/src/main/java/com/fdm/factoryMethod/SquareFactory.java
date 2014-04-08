package com.fdm.factoryMethod;

public class SquareFactory implements ShapeFactory {

	public Shape create() {
		return new Square();
	}

}
