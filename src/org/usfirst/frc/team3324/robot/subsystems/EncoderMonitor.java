package org.usfirst.frc.team3324.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class EncoderMonitor extends Subsystem {
	private static int ENCODER_CHA = 0;
	private static int ENCODER_CHB = 1;
	private Encoder mEncoder = new Encoder(ENCODER_CHA, ENCODER_CHB);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

