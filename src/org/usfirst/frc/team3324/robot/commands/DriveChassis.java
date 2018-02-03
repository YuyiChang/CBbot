package org.usfirst.frc.team3324.robot.commands;

import org.usfirst.frc.team3324.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveChassis extends Command {
	private XboxController mController = new XboxController(0);
	

    public DriveChassis() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.kChassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		
    }
    

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		double lVal = mController.getY(Hand.kLeft);
		double rVal = mController.getX(Hand.kRight);
		
		// Some math here to compute the powers
		
		Robot.kChassis.driveTank(lVal, rVal);
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
