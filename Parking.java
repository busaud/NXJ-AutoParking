import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Parking implements Behavior{

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return Attributes.enoughSpace;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		LCD.clear();
		LCD.drawString("Parking", 1, 1);
		
		Motor.C.stop();
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
