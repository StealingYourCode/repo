package com.fdmgroup.exceptions;

/** This Demo uses RuntimeExceptions to demonstrate try-catch blocks.
 * 	Normally we handle RuntimeExceptions with defensive coding, but here
 * 	they help us simulate checked exception handling. */

public class ExceptionPropagationExample {

    public static void main (String[] args ) {
    	divideSafely( new String[] {"1","1"} );  
    }

    private static void divideSafely(String[] array) {
    	
        try {
        	
        	System.out.println(divideArray(array));
            System.out.println("End of try...");
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect usage. Need two integer args.");
        } catch (NumberFormatException e) {
            System.out.println("Args must be integers.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
        	// always runs
        	System.out.println("Finally!");
        }
        
        System.out.println("After try-catch...");
        
    }

    private static int divideArray(String[] array) throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException {
       
    	String s1 = array[0];
        String s2 = array[1];
        return divideStrings(s1, s2);
    }

    private static int divideStrings(String s1, String s2) throws ArithmeticException, NumberFormatException {
       
    	int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        return divideInts(i1, i2);
    }

    private static int divideInts(int i1, int i2) throws ArithmeticException
    {
        return i1 / i2;
    }
	
}











