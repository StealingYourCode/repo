package com.fdm.platform.controllers;

public abstract class _RepeatingPageController 
		implements _PageController 
{

	protected boolean isRunning = true;
	
	@Override
	public abstract void setup();
	
	@Override
	public abstract void runPage();
	
}
