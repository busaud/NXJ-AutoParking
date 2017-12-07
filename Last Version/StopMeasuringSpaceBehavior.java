//Adil
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class StopMeasuringSpaceBehavior implements Behavior{
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return !Attributes.parked && Motor.C.isMoving() && Attributes.isMeasuring && Attributes.ultrasonicSensor.getDistance() < Attributes.DISTANCE_CAR_ROBOT;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		LCD.clear();
		LCD.drawString("Stoping Measuring", 1, 1);

		Attributes.isMeasuring = false;
		double parkSpace = Motor.C.getTachoCount() / 360.0 *Math.PI * Attributes.WHEEL_DIAMETER;
		Attributes.enoughSpace = parkSpace > Attributes.ROBOT_LENGHT;
		
		LCD.clear();
		LCD.drawInt(Motor.C.getTachoCount(), 1, 1);
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}
}
