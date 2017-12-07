import lejos.nxt.Motor;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.NXTConnection;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Driver {
	public static Arbitrator arb;
	public static void main(String args[]) {
		//Motor.C.setSpeed(Attributes.MOTOR_SPEED);
		//Motor.B.setSpeed(Attributes.MOTOR_SPEED);
		
		Attributes.bluetoothConnection = Bluetooth.waitForConnection(0, NXTConnection.RAW);
		
		Behavior start = new StartBehavior();
		Behavior startMeasuring = new StartMeasuringSpaceBehavior();
		Behavior stopMeasuring = new StopMeasuringSpaceBehavior();
		Behavior parking = new Parking();
		//Behavior right = new RevearseRightBehavior();
		//Behavior left = new RevearseLeftBehavior();
		//Behavior setPosistion = new SetPositionBehavior();
		Behavior returning = new StartReturningBehavior();
		
		arb = new Arbitrator(new Behavior[]{parking, stopMeasuring, startMeasuring,start, returning});
		arb.start();
		
	}
}
