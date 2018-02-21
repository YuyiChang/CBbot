package org.usfirst.frc.team3324.robot.subsystems;

import org.usfirst.frc.team3324.robot.RobotMap;
import org.usfirst.frc.team3324.robot.commands.collector.CollectorStop;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Collector extends Subsystem {
	private Victor leftIntakeMotor = new Victor(RobotMap.PWM_PORT_INTAKE_L); 
	private Victor rightIntakeMotor = new Victor(RobotMap.PWM_PORT_INTAKE_R); 
	private SpeedControllerGroup IntakeMotors = new SpeedControllerGroup(leftIntakeMotor, rightIntakeMotor);
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    		// if leftIntakeMotor isn't inverted, then invert it
    		if(!leftIntakeMotor.getInverted()) {
    			leftIntakeMotor.setInverted(true);
    		}
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    		setDefaultCommand(new CollectorStop());
    }
    
    public void stop() {
    		IntakeMotors.set(0);
    }
    
    public void forward() {
    		IntakeMotors.set(RobotMap.SPEED_INTAKE_FORWARD);
    }
    
    public void backward() {
    		IntakeMotors.set(RobotMap.SPEED_INTAKE_BACKWARD);
    }
}

