package com.fdm.platform.displays;

public interface _DisplayManager 
{

	public void displayUserMenu();
	public void displayAdminMenu();
	public void declareBanUser();
	public void declareChangePassword();
	public void declareCreateNewUser();
	public void declareGiveAdminPrivs();
	public void declareUnbanUser();
	public void promptForUsername();
	public void promptForPassword();
	public void promptForNewPassword();
	public void promptForNewUsername();
	public void promptForMenuSelection();
	public void declareSuccess();
	
}
