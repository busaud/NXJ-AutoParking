import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class RevearseRightBehavior implements Behavior{
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return !Attributes.parked && Attributes.enoughSpace &&
				!Motor.C.isMoving() && Attributes.firstStep;
	}

	@Override
	public void action() {
		LCD.clear();
		LCD.drawString("Reverse Right", 1, 1);
		// TODO Auto-generated method stub
		Motor.B.rotate(90);
		Motor.C.rotate(-400);
		
		Attributes.firstStep = false;
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
