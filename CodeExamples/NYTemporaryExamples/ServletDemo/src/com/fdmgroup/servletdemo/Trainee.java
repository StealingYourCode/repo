package com.fdmgroup.servletdemo;

import java.util.Random;

public class Trainee {

	// no fields!
	
	public String getStream(){
		
		int x = new Random().nextInt(4);
		switch (x) {
		case 1: return "JAVA";
		case 2: return "PMO";
		case 0: return "PIZZAMAKING";
		default: return "DA";
		}
	}
	
	public String getName(){
		int x = new Random().nextInt(4);
		switch (x) {
		case 1: return "Brian";
		case 2: return "Gurbakhshish";
		case 0: return "Michael";
		default: return "Yumei";
		}
	}
	
	public String toString(){
		return "Some Trainee in Some Stream";
	}
}
