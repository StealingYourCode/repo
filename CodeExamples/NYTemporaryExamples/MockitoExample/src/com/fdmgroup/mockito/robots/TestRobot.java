package com.fdmgroup.mockito.robots;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

import org.junit.Test;


public class TestRobot {

	@Test
	public void testDestroySuccess() {
		
		// 1. Mock
		
		Weapon mockWeapon = mock(Weapon.class);
		Robot robot = new Robot(mockWeapon);

		// 2. Use the mock
		robot.destroy(3);

		// 3. Verify the behavior took place
		verify(mockWeapon).fire(3);
		
	}

}
