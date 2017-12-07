//Martin
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class StartBehavior implements Behavior{

	@Override
	public boolean takeControl() {
		if(!Attributes.parked && !Motor.C.isMoving())		
				return Attributes.getBluetoothMessage() == (byte) 0; 
		return false;
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
