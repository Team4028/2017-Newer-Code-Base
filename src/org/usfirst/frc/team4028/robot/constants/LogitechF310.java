package org.usfirst.frc.team4028.robot.constants;

/**
 * This class contains global constants that define the layout of a Logitech F310 Gamepad
 * 
 * Date			Rev		Author						Comments
 * -----------	------	-------------------------	---------------------------------- 
 * 26.Jul.2015	0.2		Tom Bruns					Added Comments, renamed class
 * 27.Jun.2015	0.1		Sebastian Rodriguez			Initial Version
 */
public class LogitechF310 {
	// Constants for buttons on a Gamepad controller
	public static final int GREEN_BUTTON_A =1;
	public static final int RED_BUTTON_B = 2;
	public static final int BLUE_BUTTON_X = 3;
	public static final int YELLOW_BUTTON_Y = 4;
	public static final int LEFT_BUMPER = 5;
	public static final int RIGHT_BUMPER = 6;
	public static final int BACK_BUTTON = 7;
	public static final int START_BUTTON = 8;
	public static final int LEFT_THUMBSTICK = 9; // Press down left joystick
	public static final int RIGHT_THUMBSTICK = 10; // Press down right joystick
	
	// Constants for Axis (Joysticks) on a Gamepad controller 
	public static final int LEFT_X_AXIS = 0;		//-1 to +1
	public static final int LEFT_Y_AXIS = 1;		//-1 to +1
	public static final int LEFT_TRIGGER = 2;		//0 to -1
	public static final int RIGHT_TRIGGER = 3;		//0 to +1
	public static final int RIGHT_X_AXIS = 4;		//-1 to +1
	public static final int RIGHT_Y_AXIS = 5;		//-1 to +1
	
	// Constants for POV (dpad)
	public static final int POV_UP_0 = 1; //0;			//Up
	public static final int POV_UP_RIGHT_1 = 1;		//Up-Right
	public static final int POV_RIGHT_2 = 2;		//Right
	public static final int POV_DOWN_RIGHT_3 = 3;	//Down-Right
	public static final int POV_DOWN_4 = 4;			//Down
	public static final int POV_DOWN_LEFT_5 = 5;	//Down-Left
	public static final int POV_LEFT_6 = 6;			//Left
	public static final int POV_UP_LEFT_7 = 7;		//Up-Left
}