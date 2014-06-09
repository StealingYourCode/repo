package com.fdmgroup.jdbc;

public class DBstorage implements Storage {

	static{
		System.out.println("Load DB Storage Class");
	}
	public DBstorage() {
		System.out.println("Making a DB Storage Item");
	}
	public void accessStorage()
	{
		System.out.println("Accessing DB Storage");
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
