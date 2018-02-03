package org.usfirst.frc.team3324.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RoboArm extends Subsystem {
	private final int ARM_MOTOR_PORT = 6;
	private Victor armMotor = new Victor(ARM_MOTOR_PORT);
	
	private final double ARM_MOTOR_SPEED = 0.3;


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void moveUp() {
		armMotor.set(ARM_MOTOR_SPEED);
	}
	
	public void moveDown() {
		armMotor.set(-ARM_MOTOR_SPEED);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

