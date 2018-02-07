package org.usfirst.frc.team1099.robot.subsystems;

import org.usfirst.frc.team1099.robot.RobotMap;
import org.usfirst.frc.team1099.robot.commands.HaltIntake;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

    Victor leftIntakeMotor = new Victor(RobotMap.leftIntake);
    Victor rightIntakeMotor = new Victor(RobotMap.rightIntake);

    
    public void spinInward(double speed) {
    	spin(-speed, speed);
    }
    
    public void spinOutward(double speed) {
    	spin(speed, -speed);
    }
    
    public void stop() {
    	spin(0.0, 0.0);
    }
    
    public void spin(double left, double right) {
        leftIntakeMotor.set(left);
        rightIntakeMotor.set(right);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new HaltIntake());
    }
}

