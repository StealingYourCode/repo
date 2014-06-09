package com.fdmgroup.jdbc;

public class RAMstorage implements Storage{

	static{
		System.out.println("Load RAM Storage Class");
	}
	public RAMstorage() {
		System.out.println("Making a RAM Storage Item");
	}
	
	public void accessStorage()
	{
		System.out.println("Accessing Ram Storage");
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
