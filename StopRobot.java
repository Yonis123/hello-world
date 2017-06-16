package nur;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;
/**
 * Yonis Nur
 * @author 324038611
 * ICS3U
 * 16/06/2017
 * Checks if a object is in front of the robot
 */
public class StopRobot implements Behavior {
	@SuppressWarnings("unused")
	private boolean suppressed = false;
	@Override
	/**
	 * take control once the button is pressed
	 */
	public boolean takeControl() {
		Button.ESCAPE.isDown();
	return true;
	}

	@Override
	/**
	 * ends program
	 */
	public void action() {
		System.exit(0);

	}

	@Override
	/**
	 * stops robot from happening 
	 */
	public void suppress() {
		suppressed = true;	

	}

}
