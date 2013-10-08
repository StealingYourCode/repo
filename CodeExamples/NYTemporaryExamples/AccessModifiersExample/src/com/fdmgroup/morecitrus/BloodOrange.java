package com.fdmgroup.morecitrus;

import com.fdmgroup.basiccitrus.Orange;
interface ThingICanEat{
	
}
public class BloodOrange extends Orange implements ThingICanEat {
	
	public String specialBloodOrangeThings = "BloodOrange things";

	
	// Which of the following signatures are valid overrides?
	//
	// Use the @Override annotation to check answers:
	// Compiler will tell you whether or not it is valid.
	
	//@Override
	protected void printOrange(){
	//public void printOrange(){
	// private void printOrange(){
	//void printOrange(){
	
		System.out.println("This is a blood orange.");
	}
	

	
	public static void main(String[] args){
		
		Orange basicOrange = new Orange();
		
		// What can we access?
		
		BloodOrange basicBloodOrange = new BloodOrange();

		// What can we access?
		
		
		Orange orangeRef_BloodOrange = new BloodOrange();
 
		
		
		// What can we access?
		
		if( orangeRef_BloodOrange instanceof BloodOrange)
			System.out.println(
					((BloodOrange)orangeRef_BloodOrange).specialBloodOrangeThings
			);


		
	}
	
	
	
}