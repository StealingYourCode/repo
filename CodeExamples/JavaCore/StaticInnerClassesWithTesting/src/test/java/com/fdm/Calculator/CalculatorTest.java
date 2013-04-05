package com.fdm.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.EvaluateMethod.class})
public class CalculatorTest {
	
	public static class EvaluateMethod{
		@Test
		public void returnsDouble1WithInputString1(){
			
		}
	}

}
