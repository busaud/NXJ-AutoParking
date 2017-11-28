import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class Parking implements Behavior{

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return !Attributes.parked && Attributes.enoughSpace;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		LCD.clear();
		LCD.drawString("Parking", 1, 1);
		Delay.msDelay(100);
		Motor.C.stop();
		//Delay.msDelay(20);
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
