package com.fdmgroup.fundamentals;

public class WideningExample {
	
	static void go(int x) { System.out.print("int "); }
	static void go(long x) { System.out.print("long "); }
	static void go(double x) { System.out.print("double "); }
	static void go(short x) { System.out.print("short ");  }

	public static void main(String [] args) {
		
		byte b = 5;
		short s = 5;
		long l = 5;
		float f = 5.0f;

//		go(20);
//		go(024);
//		go(0x14);
		
	    go(b);
	    go(s);
	    go(l);
	    go(f);
	}	
}