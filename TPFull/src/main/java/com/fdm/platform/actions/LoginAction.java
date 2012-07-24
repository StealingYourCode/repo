package com.fdm.platform.actions;

import java.io.IOException;

import com.fdm.platform.controllers.AdminController;
import com.fdm.platform.controllers.UserController;
import com.fdm.platform.displays.ReaderUtility;
import com.fdm.platform.displays._DisplayManager;
import com.fdm.platform.giveToTrainees.ActionManagerException;
import com.fdm.platform.giveToTrainees.UserAccountDTO;
import com.fdm.platform.giveToTrainees._ActionManager;

public class LoginAction implements _Action {

	@Override
	public void execute(_DisplayManager displayManager,
			_ActionManager actionManager, ReaderUtility reader)
			throws ActionExecutionException 
	{
		String username;
		String password;
		
		try {
			displayManager.promptForUsername();
			username = reader.getInputAsString();
			displayManager.promptForPassword();
			password = reader.getInputAsString();
			UserAccountDTO dto = actionManager.login(username, password);
			if(dto.isAdmin()) {
				AdminController admin = new AdminController();
				admin.setup();
			} else {
				UserController user = new UserController();
				user.setup();
			}
		} catch (IOException ioe) {
			throw new ActionExecutionException(ioe);
		} catch (ActionManagerException ame) {
			throw new ActionExecutionException(ame);
		}
	}

}
