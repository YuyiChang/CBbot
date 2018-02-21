/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3324.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static final int armEncoderChA = 0;
	public static final int armEncoderChB = 1;
	public static final double armKp = 0;
	public static final double armKi = 0;
	public static final double armKd = 0;
	
	public static final int DIG_PORT_ARM_FRONT_LIMIT = 0;
	public static final int DIG_PORT_ARM_BACK_LIMIT = 1;
	
	public static final int PWM_PORT_INTAKE_L = 0;
	public static final int PWM_PORT_INTAKE_R = 1;
	
	public static final double SPEED_INTAKE_FORWARD = 0.7;
	public static final double SPEED_INTAKE_BACKWARD = -0.7;
	
}
