package com.fdm.platform.actions;

import com.fdm.platform.displays.ReaderUtility;
import com.fdm.platform.displays._DisplayManager;
import com.fdm.platform.giveToTrainees._ActionManager;

public interface _Action {

	public void execute(
			_DisplayManager displayManager, 
			_ActionManager ActionManager,
			ReaderUtility readerUtility)
	throws ActionExecutionException;
	
}
