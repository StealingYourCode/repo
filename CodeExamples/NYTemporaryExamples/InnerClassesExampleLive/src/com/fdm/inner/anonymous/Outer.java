package com.fdm.inner.anonymous;


abstract class Popcorn {
	public void pop(){
		System.out.println("Standard pop");
	}
}

public class Outer {

	public static void main(String[] args) {

		//Popcorn p1 = new Popcorn(); // regular Popcorn
		//p1.pop();
		
		Popcorn p2 = new Popcorn(){
			
			@Override
			public void pop(){
				System.out.println("Fancy pop");
			}
		};
		
		p2.pop();
		
		Popcorn p3 = new Popcorn(){
			
		};
		
		Popcorn p4 = new Popcorn(){
			
		};
		
		eatPopcorn(new Popcorn(){/*...*/});
		
	}

	public static void eatPopcorn(Popcorn popcorn){}
}

