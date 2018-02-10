package org.usfirst.frc.team3324.robot.commands;

import org.usfirst.frc.team3324.robot.OI;
import org.usfirst.frc.team3324.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveChassis extends Command {
	private SmartDashboard mDs = new SmartDashboard();
	
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
		Robot.kChassis.drive(OI.getLeftY(), OI.getRightX());
		
		double value = 0;
		SmartDashboard.setDefaultNumber("This is key", value);
		SmartDashboard.putNumber("Tag", value);
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
