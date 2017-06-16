package nur;

import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
/**
 * Yonis Nur
 * @author 324038611
 * ICS3U
 * 16/06/2017
 * follows black line and goes through direction with object there object  
 */
public class arbitrator1 {
	public static LightSensor light = new LightSensor(SensorPort.S3);
	
	
	public static void main(String[] args) {
	
		
	Behavior b0 = new StopRobot();
    Behavior b1 = new DriveForward();
	Behavior b2 = new RotateRobot();
    Behavior b3 = new SensePulse();
	Behavior [] behaviours = { b0, b1, b2, b3};
	Arbitrator arby = new Arbitrator(behaviours);
		Button.waitForAnyPress();
		arby.start();

	}

}
