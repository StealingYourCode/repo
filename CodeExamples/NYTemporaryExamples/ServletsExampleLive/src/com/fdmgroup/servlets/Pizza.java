package com.fdmgroup.servlets;


public class Pizza {

	private String thisIsTheTypeOfPizza;
	private String crust;
	
	public Pizza(){
		thisIsTheTypeOfPizza = "cheese";
		crust = "delicious";
	}
	

	public String getTypeOfCrust(){
		return crust;
	}
	
	public void setTypeOfCrust(String newType){
		crust = newType;
	}	
	
	
	public String getType(){
		return thisIsTheTypeOfPizza;
	}
	
	public void setType(String newType){
		thisIsTheTypeOfPizza = newType;
	}
}
