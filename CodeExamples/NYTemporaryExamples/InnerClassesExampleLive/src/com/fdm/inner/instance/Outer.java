package com.fdm.inner.instance;


public class Outer {
	
	private int x;
	public int y;
	
	class Inner {
		
		private int inner_x;
		public int inner_y;
		
		public void innerMethod(){
			Outer.this.x = 7;
			Outer.this.y = 8;
		}
		
	}
	
	public static void main(String[] args) {
		// static method
		// no instances yet
		

		Inner inner = new Outer().new Inner();
		
		inner.inner_x = 3;
		inner.inner_y = 4;
		inner.innerMethod();
		
	}

}


class AnotherClass {
	public void anotherMethod(){
		
		Outer outer = new Outer();
		
		Outer.Inner inner = outer.new Inner();
	}
}
