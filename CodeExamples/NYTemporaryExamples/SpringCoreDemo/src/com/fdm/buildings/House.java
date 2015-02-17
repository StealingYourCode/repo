package com.fdm.buildings;

public class House extends Building {

	private Person headOfHousehold;

	public Person getHeadOfHousehold() {
		return headOfHousehold;
	}

	public void setHeadOfHousehold(Person headOfHousehold) {
		this.headOfHousehold = headOfHousehold;
	}
	
	@Override
	public String toString() {
		return "\nType: House\n"
				+ super.toString()+"\n"+
				"Head of Household: " + headOfHousehold;
	}
	
}
