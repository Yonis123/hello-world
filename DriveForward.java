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
 * drives forward once the robot senses the black line is in front of it
 */
public class DriveForward implements Behavior {
	LightSensor light = new LightSensor(SensorPort.S3);
	@SuppressWarnings("unused")
	private boolean suppressed = false;
	@Override
	/**
	 * Starts the action if the robot senses a black line in front of it
	 */
	public boolean takeControl() {
		
		if(light.getLightValue() < 35){
			return true;
		}
		return false;
	}

	@Override
	/**
	 * Goes forward
	 */
	public void action() {

		if (light.getLightValue() < 35) {
			Motor.B.setSpeed(400);
			Motor.C.setSpeed(400);
			Motor.C.forward();
			Motor.B.forward();
		} 
		
	
	}

	@Override
	/**
	 * Stops action from starting
	 */
	public void suppress() {
	suppressed = true;

	}

}
