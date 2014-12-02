package com.fdmgroup.fundamentals;

public class OverloadingAmbiguityExample {

	public static void go(long x) {

		System.out.println("long method");
	}

	public static void go(Object x) {

		System.out.println("Object method");
	}

	public static void go(int x, String... y) {

		System.out.println("int, Var-arg String method");
	}

	public static void main(String[] args) {

		go(7);

	}

}
