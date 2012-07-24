package com.fdm.platform.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fdm.platform.actions.ActionExecutionException;
import com.fdm.platform.actions.BanUserAction;
import com.fdm.platform.actions.ChangePasswordAction;
import com.fdm.platform.actions.CreateNewUserAction;
import com.fdm.platform.actions.GiveAdminPrivilegesAction;
import com.fdm.platform.actions.UnbanUserAction;
import com.fdm.platform.actions._Action;
import com.fdm.platform.displays.DisplayManager;
import com.fdm.platform.displays.ReaderUtility;
import com.fdm.platform.displays._DisplayManager;
import com.fdm.platform.giveToTrainees.ActionManager;
import com.fdm.platform.giveToTrainees._ActionManager;

public class AdminController extends _RepeatingPageController 
{

	private Map<Integer,_Action> choiceMap;
	private static final int CHANGE_PASSWORD = 1;
	private static final int CREATE_NEW_USER = 2;
	private static final int BAN_USER = 3;
	private static final int UNBAN_USER = 4;
	private static final int GIVE_ADMIN_PRIVS = 5;
	private static final int LOG_OUT = 6;
	private _DisplayManager displayManager;
	private _ActionManager actionManager;
	private ReaderUtility readerUtility;
	
	@Override
	public void setup() {
		isRunning = true;
		choiceMap = new HashMap<Integer,_Action>();
		choiceMap.put(CHANGE_PASSWORD, new ChangePasswordAction());
		choiceMap.put(CREATE_NEW_USER, new CreateNewUserAction());
		choiceMap.put(BAN_USER, new BanUserAction());
		choiceMap.put(UNBAN_USER, new UnbanUserAction());
		choiceMap.put(GIVE_ADMIN_PRIVS, new GiveAdminPrivilegesAction());
		displayManager = new DisplayManager();
		actionManager = new ActionManager();
		runPage();
	}

	@Override
	public void runPage() {
		while(isRunning) {
			try {
				displayManager.displayAdminMenu();
				displayManager.promptForMenuSelection();
				String displayChoiceString = 
						readerUtility.getInputAsString();
				int choice = Integer.parseInt(displayChoiceString);
				if(choice==LOG_OUT) {
					isRunning=false;
					return;
				} else {
						choiceMap.get(choice).execute(
								displayManager,
								actionManager,
								readerUtility);
				}
			} catch (IOException ioe) {
				System.out.println("Cannot read choice");
			} catch (NullPointerException npe) {
				System.out.println("Invalid choice");
			} catch (ActionExecutionException aee) {
				System.out.println(aee.getMessage());
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid choice");
			}
		}
	}

}
