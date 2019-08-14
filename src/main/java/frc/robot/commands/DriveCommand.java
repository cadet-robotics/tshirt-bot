package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A command directly controlling the drive train
 * 
 * TODO: Fill in requires, fill in initialize
 * 
 * @author Alex Pickering
 */
public class DriveCommand extends Command {
	
	private double left, right;
	
	/**
	 * Runs a command that changes the settings of the drive train
	 * 
	 * @param leftThrottle The speed of the left track
	 * @param rightThrottle The speed of the right track
	 */
	public DriveCommand(double leftThrottle, double rightThrottle) {
		//Requires drive train subsystem
		
		left = leftThrottle;
		right = rightThrottle;
	}
	
	@Override
	protected void initialize() {
		//Change the motor speeds here
	}
	
	@Override
	protected void execute() {}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
	
	@Override
	protected void end() {}
	
	@Override
	protected void interrupted() {}
}
