import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Sound;
import lejos.robotics.subsumption.Behavior;

public class SetPositionBehavior implements Behavior{

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return !Attributes.parked && Attributes.finalStep;
	}

	@Override
	public void action() {
		Motor.B.rotate(90);
		Motor.C.rotate(180);
		
		Attributes.parked = true;
		
		
		LCD.clear();
		LCD.drawString("Tada!!", 1, 1);
		Sound.buzz();
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
