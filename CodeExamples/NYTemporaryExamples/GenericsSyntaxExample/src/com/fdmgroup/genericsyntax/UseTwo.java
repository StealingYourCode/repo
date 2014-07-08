package com.fdmgroup.genericsyntax;

public class UseTwo<T, X> {

	T	one;
	X	two;

	UseTwo(T one, X two) {

		this.one = one;
		this.two = two;
	}

	T getT() {

		return one;
	}

	X getX() {

		return two;
	}

	public static void main(String[] args) {
		
		UseTwo<Integer,String> myUseTwo = 
				new UseTwo<Integer,String>(8,"hello");
		
		int one = myUseTwo.getT();
		String two = myUseTwo.getX();
	}
}


