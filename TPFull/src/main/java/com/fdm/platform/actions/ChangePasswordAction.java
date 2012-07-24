package com.fdm.platform.actions;

import java.io.IOException;

import com.fdm.platform.displays.ReaderUtility;
import com.fdm.platform.displays._DisplayManager;
import com.fdm.platform.giveToTrainees.ActionManagerException;
import com.fdm.platform.giveToTrainees._ActionManager;

public class ChangePasswordAction implements _Action {

	@Override
	public void execute(_DisplayManager displayManager,
			_ActionManager actionManager, ReaderUtility readerUtility)
			throws ActionExecutionException 
	{
		try {
			displayManager.declareChangePassword();
			displayManager.promptForUsername();
			String username = readerUtility.getInputAsString();
			displayManager.promptForPassword();
			String oldPassword = readerUtility.getInputAsString();
			displayManager.promptForNewPassword();
			String newPassword = readerUtility.getInputAsString();
			actionManager.changePassword(username,oldPassword,newPassword);
			displayManager.declareSuccess();
		} catch (IOException ioe) {
			throw new ActionExecutionException(ioe);
		} catch (ActionManagerException ame) {
			throw new ActionExecutionException(ame);
		}

	}

}
