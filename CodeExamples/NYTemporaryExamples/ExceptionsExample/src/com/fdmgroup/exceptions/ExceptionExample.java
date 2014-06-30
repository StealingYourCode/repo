package com.fdmgroup.exceptions;


public class ExceptionExample {

    public static void main (String[] args ) {
       divideSafely( new String[] {"100"} );  
    }

    private static void divideSafely(String[] array) {
    	
        try {
        	
        	System.err.println(divideArray(array));
            System.out.println("We are done.");
        	//return;
        	//System.exit(0);
       
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Usage: ExceptionDemo <num1> <num2>");
        } catch (NumberFormatException e) {
            System.err.println("Args must be integers");
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero");
        } finally {
        	// always runs
        	System.err.println("FINALLY");
        }
        
        System.err.println("After trying...");
        
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











