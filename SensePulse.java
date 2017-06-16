package nur;


import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
/**
 * Yonis Nur
 * @author 324038611
 * ICS3U
 * 16/06/2017
 * Checks if a object is in front of the robot
 */

public class SensePulse implements Behavior {
	UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	@SuppressWarnings("unused")
	private boolean suppressed = false;
	
	@Override
	/**
	 * checks if object is in front of robot
	 */
	public boolean takeControl() {
		//checks if object is in front
		sonar.ping();
		sonar.getDistance();
		//checks if object is in front
		if(sonar.getDistance() < 23){
			return true;
		}
		return false;
	}

	@Override
	/**
	 * Makes robot go forward
	 */
	public void action() {
	
	Motor.B.forward();
	Motor.C.forward();

	}

	@Override
	/**
	 * Stops action from happening 
	 */
	public void suppress() {
	suppressed = true;

	}

}
