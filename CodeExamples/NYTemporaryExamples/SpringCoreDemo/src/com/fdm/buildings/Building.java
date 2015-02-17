package com.fdm.buildings;

public abstract class Building {

	private Address address;
	
	public Building() {
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Building at " + address;
	}

	
}
