package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A command that controls the aim of the cannon
 * 
 * TODO: AAAAAAAAAAAAAAAA
 * 
 * @author Alex Pickering
 */
public class AimCommand extends Command {
	
	private double targetAngleVertical; //we might get horizontal aim
	
	public AimCommand(double targetAngleVertical) {
		//Requires aiming subsystem
		//Requires cannon subsystem
		
		this.targetAngleVertical = targetAngleVertical;
	}
	
	@Override
	protected void initialize() {
		//uuuuuuuuuuuuuuuuuuuuuuuuuhhhhhhhhhhhh
	}
	
	@Override
	protected void execute() {
		//Move the thing and check the angle its at
	}
	
	@Override
	protected boolean isFinished() {
		//TODO: replace with check
		return true;
	}
	
	@Override
	protected void end() {}
	
	@Override
	protected void interrupted() {}
}
