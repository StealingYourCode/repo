package com.fdm.platform.controllers;


public class ApplicationStarter {

	public static void main(String[] Args)
	{
		LoginController loginController = new LoginController();
		loginController.setup();
	}
	
}
