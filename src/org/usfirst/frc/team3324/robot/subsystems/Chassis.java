package org.usfirst.frc.team3324.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Chassis extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	// Parameters
	private static final double MAX_POWER = 1.0;
	private static final double DEFAULT_FWD_POWER = 0.5;
	private static final double DEFAULT_REV_POWER = -0.5;
	
	// Instantiate motors and motor groups
	Victor mLeftOne = new Victor(0);
	Victor mLeftTwo = new Victor(1);
	SpeedControllerGroup mLeft = new SpeedControllerGroup(mLeftOne, mLeftTwo);
	
	Victor mRightOne = new Victor(2);
	Victor mRightTwo = new Victor(3);
	SpeedControllerGroup mRight = new SpeedControllerGroup(mRightOne, mRightTwo);
	
	DifferentialDrive mDrive = new DifferentialDrive(mLeft, mRight);
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	// Do nothing
    }
    
    // Compute composite motor power from gamepad input
    // Using tankDrive�s squareInit to increase sensitivity in low speed
    public void driveTank(double lGamepad, double rGamepad) {
    	double lPower = lGamepad + rGamepad;
    	double rPower = lGamepad - rGamepad;
    	// If either one side's power is more than 1, factor by multiply the recirpocal
    	if(lPower > MAX_POWER) {
    		double reciprocal = 1.0 / lPower;
    		lPower *= reciprocal;
    		rPower *= reciprocal;
    	}
    	else if(rPower > MAX_POWER) {
    		double reciprocal = 1.0 / rPower;
    		lPower *= reciprocal;
    		rPower *= reciprocal;
    	}
    	mDrive.tankDrive(lPower, rPower, true);
    }
    
    // TODO: adding default motion methods used for autonomous
}

