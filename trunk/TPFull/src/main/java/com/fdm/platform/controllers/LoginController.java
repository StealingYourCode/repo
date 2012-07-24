package com.fdm.platform.controllers;

import com.fdm.platform.actions.ActionExecutionException;
import com.fdm.platform.actions.LoginAction;
import com.fdm.platform.displays.DisplayManager;
import com.fdm.platform.displays.ReaderUtility;
import com.fdm.platform.displays._DisplayManager;
import com.fdm.platform.giveToTrainees.ActionManager;
import com.fdm.platform.giveToTrainees._ActionManager;

public class LoginController implements _PageController {

	private LoginAction loginAction;
	private ReaderUtility reader;
	private _ActionManager actionManager;
	private _DisplayManager displayManager;
	
	@Override
	public void setup()
	{
		loginAction = new LoginAction();
		actionManager = new ActionManager();
		displayManager = new DisplayManager();
		reader = new ReaderUtility();
		runPage();
	}
	
	public void runPage()
	{
		try {
			loginAction.execute(displayManager,actionManager,reader);
		} catch (ActionExecutionException aee) {
			System.out.println(aee.getMessage());
		}
	}
	
}
