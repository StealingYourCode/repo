package com.fdm.platform.actions;

import java.io.IOException;

import com.fdm.platform.displays.ReaderUtility;
import com.fdm.platform.displays._DisplayManager;
import com.fdm.platform.giveToTrainees.ActionManagerException;
import com.fdm.platform.giveToTrainees._ActionManager;

public class CreateNewUserAction implements _Action {

	@Override
	public void execute(_DisplayManager displayManager,
			_ActionManager actionManager, ReaderUtility readerUtility)
			throws ActionExecutionException 
	{
		try{
			displayManager.declareCreateNewUser();
			displayManager.promptForNewUsername();
			String username = readerUtility.getInputAsString();
			displayManager.promptForNewPassword();
			String password = readerUtility.getInputAsString();
			actionManager.createNewUser(username, password);
			displayManager.declareSuccess();
		} catch(IOException ioe) {
			throw new ActionExecutionException(ioe);
		} catch(ActionManagerException ame) {
			throw new ActionExecutionException(ame);
		}
		
	}

}
