package com.fdm.platform.displays;

public class DisplayManager implements _DisplayManager 
{

	DisplayUtility utility = new DisplayUtility();
	
	@Override
	public void displayUserMenu()
	{
		utility.writeItemToConsole(
				DisplayConstants.OPTION_ONE, 
				DisplayConstants.CHANGE_PASSWORD);
		utility.writeItemToConsole(
				DisplayConstants.OPTION_TWO,
				DisplayConstants.LOG_OUT);
	}
	
	@Override
	public void displayAdminMenu()
	{
		utility.writeItemToConsole(
				DisplayConstants.OPTION_ONE, 
				DisplayConstants.CHANGE_PASSWORD);
		utility.writeItemToConsole(
				DisplayConstants.OPTION_TWO,
				DisplayConstants.CREATE_NEW_USER);
		utility.writeItemToConsole(
				DisplayConstants.OPTION_THREE,
				DisplayConstants.GRANT_ADMIN_PRIVILEGES);
		utility.writeItemToConsole(
				DisplayConstants.OPTION_FOUR,
				DisplayConstants.BAN_USER);
		utility.writeItemToConsole(
				DisplayConstants.OPTION_FIVE,
				DisplayConstants.UNBAN_USER);
		utility.writeItemToConsole(
				DisplayConstants.OPTION_SIX,
				DisplayConstants.LOG_OUT);
	}
	
	@Override
	public void promptForUsername()
	{
		utility.writeToConsole(DisplayConstants.ENTER_USERNAME);
	}
	
	@Override
	public void promptForPassword()
	{
		utility.writeToConsole(DisplayConstants.ENTER_PASSWORD);
	}
	
	@Override
	public void declareSuccess()
	{
		utility.writeToConsole(DisplayConstants.SUCCESS);
	}

	@Override
	public void promptForNewPassword() {
		utility.writeToConsole(DisplayConstants.ENTER_NEW_PASSWORD);
		
	}

	@Override
	public void promptForNewUsername() {
		utility.writeToConsole(DisplayConstants.ENTER_NEW_USER);
	}

	@Override
	public void declareBanUser() {
		utility.writeToConsole(DisplayConstants.BAN_USER);
	}

	@Override
	public void declareChangePassword() {
		utility.writeToConsole(DisplayConstants.CHANGE_PASSWORD);
	}

	@Override
	public void declareCreateNewUser() {
		utility.writeToConsole(DisplayConstants.CREATE_NEW_USER);
	}

	@Override
	public void declareGiveAdminPrivs() {
		utility.writeToConsole(DisplayConstants.GRANT_ADMIN_PRIVILEGES);
	}

	@Override
	public void declareUnbanUser() {
		utility.writeToConsole(DisplayConstants.UNBAN_USER);
	}

	@Override
	public void promptForMenuSelection() {
		utility.writeToConsole(DisplayConstants.SELECT_MENU_OPTION);
	}
	
}
