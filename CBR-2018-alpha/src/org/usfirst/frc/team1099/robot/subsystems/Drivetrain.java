package org.usfirst.frc.team1099.robot.subsystems;

import org.usfirst.frc.team1099.robot.RobotMap;
import org.usfirst.frc.team1099.robot.commands.TeleDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	TalonSRX leftDrive = new TalonSRX(RobotMap.leftDriveMotor);
	TalonSRX leftFollower = new TalonSRX(RobotMap.leftFollowerMotor);

	TalonSRX rightDrive = new TalonSRX(RobotMap.rightDriveMotor);
	TalonSRX rightFollower = new TalonSRX(RobotMap.rightFollowerMotor);
	
	public Drivetrain() {
	
		leftFollower.follow(leftDrive);
		rightFollower.follow(rightDrive);
		
		// one of them is reversed
		leftDrive.setInverted(true);
		
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new TeleDrive());
    }
    
    public void vDrive(double right, double left) {
		leftDrive.set(ControlMode.PercentOutput, left);
		rightDrive.set(ControlMode.PercentOutput, right);
    }
}

