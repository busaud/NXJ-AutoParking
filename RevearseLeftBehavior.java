import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class RevearseLeftBehavior implements Behavior{

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return !Attributes.parked && !Motor.C.isMoving() && !Attributes.firstStep;
	}

	@Override
	public void action() {
		for(int i=1; i<=2; i++) {
			Motor.B.rotate(-90);
			Motor.C.rotate(-320);
		}
		Attributes.finalStep = true;
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
