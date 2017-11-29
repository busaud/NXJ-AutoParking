import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class StartMeasuringSpaceBehavior implements Behavior{

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return !Attributes.parked && Motor.C.isMoving() && !Attributes.isMeasuring && Attributes.ultrasonicSensor.getDistance() > Attributes.DISTANCE_CAR_ROBOT;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		LCD.clear();
		LCD.drawString("Starting Measuring ", 1, 1);
		Attributes.totalTachoCount += Motor.C.getTachoCount();
		Attributes.isMeasuring = true;
		Motor.C.resetTachoCount();
		Motor.C.forward();
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}
