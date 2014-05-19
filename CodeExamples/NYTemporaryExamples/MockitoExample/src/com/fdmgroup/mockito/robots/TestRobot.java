package com.fdmgroup.mockito.robots;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;


public class TestRobot {

	@Test
	public void test() {
		
		Weapon mockWeapon = mock(Weapon.class);
		Robot robot = new Robot(mockWeapon);

		robot.destroy(3);
		
		verify(mockWeapon).fire(3);
		
	}

}
