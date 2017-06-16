package nur;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

/**
 * Yonis Nur
 * @author 324038611
 * ICS3U
 * 16/06/2017
 * Rotates robot if it's not on the black line
 */

public class RotateRobot implements Behavior {
	LightSensor light = new LightSensor(SensorPort.S3);
	@SuppressWarnings("unused")
	private boolean suppressed = false;
	@Override
	/**
	 * rotates robot if it's not on the black line
	 */
	public boolean takeControl() {
		if(light.getLightValue() > 35){
		return true;
	}
	return false;
	}
	@Override
	/**
	 * rotates the robot
	 */
	public void action() {

		Motor.C.rotate(10);

		
	}

	@Override
	/**
	 * Stops action from happening 
	 */
	public void suppress() {
	suppressed = true;

	}

}
