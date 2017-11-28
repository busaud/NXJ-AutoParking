import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class StartBehavior implements Behavior{

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return !Attributes.parked && !Motor.C.isMoving();
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		LCD.clear();
		LCD.drawString("Starting Auto Parking", 1, 1);
		Motor.C.forward();
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}
	
}
