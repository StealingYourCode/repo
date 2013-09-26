package com.fdmgroup.onlyoranges.onlybloodoranges;

import com.fdmgroup.onlyoranges.Orange;

public class BloodOrange extends Orange {
	
	String color = "orange";
	
	@Override
	public void printOrange(){
		System.out.println("This is a blood orange.");
	}
	
	@Override
	public boolean equals(Object o){
		
		if(! (o instanceof BloodOrange))
			return false;
				
		return true;
	}

	public static void main(String[] args){
		
		Orange orange = new BloodOrange();
		 orange.printOrange();
		
		
		Orange[] oranges = {new Orange(), new BloodOrange(),
						new BloodOrange(), new Orange()};
		
		
		for(int i = 0; i<4; i++)
			oranges[i].printOrange();
		
		
		
		for(Orange o : oranges){
			
			if(o instanceof Orange)
				System.out.println("true!");
			else
				System.out.println("false");
			
			
		}

		
	}
	
	
	
}