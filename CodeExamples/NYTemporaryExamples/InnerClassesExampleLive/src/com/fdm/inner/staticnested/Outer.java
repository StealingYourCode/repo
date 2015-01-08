package com.fdm.inner.staticnested;

import java.util.Map;

//import static com.fdm.inner.staticnested.Outer.Inner;

public class Outer {

	static class Inner {
		public int idNumber;
	}
	
	
	public static void main(String[] args) {

		Inner inner = new Inner();
	}

}
class Another{
	public void method(){
		Outer.Inner inner = new Outer.Inner();
	}
}