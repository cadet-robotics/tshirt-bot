package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A command to fire the canon
 * 
 * TODO: e
 * 
 * @author Alex Pickering
 */
public class FireCommand extends Command {
	
	public FireCommand() {
		//Requires aiming subsystem
		//Requires cannon subsystem
	}
	
	@Override
	protected void initialize() {
		//FIRE ZE FLAMENWHERFER
	}
	
	@Override
	protected void execute() {}
	
	@Override
	protected boolean isFinished() {
		//TODO: Replace with stuff
		return true;
	}
	
	@Override
	protected void end() {}
	
	@Override
	protected void interrupted() {}
}
