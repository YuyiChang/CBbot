package org.usfirst.frc.team3324.robot.subsystems;

import org.usfirst.frc.team3324.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalSource;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RoboArm extends Subsystem {
	
	private static final double MIN_ARM_MOTOR_POWER = -0.5;
	private static final double MAX_ARM_MOTOR_POWER = 0.5;
	private static final double ARM_MOTOR_TOLERENCE_PERCENT = 2.5;
	
	private final int ARM_MOTOR_PORT = 6;
	private Victor armMotor = new Victor(ARM_MOTOR_PORT);
	
	private final double ARM_MOTOR_SPEED = 0.3;
	
	
	private Encoder armEncoder = new Encoder(RobotMap.armEncoderChA, RobotMap.armEncoderChB);
	private PIDController mPid = new PIDController(RobotMap.armKp, RobotMap.armKi, RobotMap.armKd, armEncoder, armMotor);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void moveUp() {
		armMotor.set(ARM_MOTOR_SPEED);
	}
	
	public void moveDown() {
		armMotor.set(-ARM_MOTOR_SPEED);
	}
	
	public void stopPid() {
		mPid.disable();
	}
	
	public void startPid() {
		mPid.enable();
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    		mPid.setOutputRange(MIN_ARM_MOTOR_POWER, MAX_ARM_MOTOR_POWER);
    		mPid.setPercentTolerance(ARM_MOTOR_TOLERENCE_PERCENT);
    }
}

