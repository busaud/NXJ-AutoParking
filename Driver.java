import lejos.nxt.Motor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Driver {
	public static Arbitrator arb;
	public static void main(String args[]) {
		Motor.C.setSpeed(Attributes.MOTOR_SPEED);
		
		Behavior start = new StartBehavior();
		Behavior startMeasuring = new StartMeasuringSpaceBehavior();
		Behavior stopMeasuring = new StopMeasuringSpaceBehavior();
		Behavior parking = new Parking();
		Behavior right = new RevearseRightBehavior();
		Behavior left = new RevearseLeftBehavior();
		Behavior setPosistion = new SetPositionBehavior();
		
		arb = new Arbitrator(new Behavior[]{parking, stopMeasuring, startMeasuring, left, right, start, setPosistion});
		arb.start();
		
	}
}
