/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1099.robot;

import org.usfirst.frc.team1099.robot.commands.EjectCube;
import org.usfirst.frc.team1099.robot.commands.GetCube;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	// 1099 CONTROLLERS
	
	// Driver - Tank drive on two Attack Joysticks
	public static Joystick lstick = new Joystick(0);
	public static Joystick rstick = new Joystick(1);
	
	// Operator - XBox controller
	public static Joystick gamepad = new Joystick(3);
	
	public OI() {
		// Operator Controls
		Button intakeButton = new JoystickButton(gamepad, 1);
		Button ejectButton = new JoystickButton(gamepad, 2);
		
		intakeButton.whileHeld(new GetCube());
		ejectButton.whileHeld(new EjectCube());
	}
	
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
