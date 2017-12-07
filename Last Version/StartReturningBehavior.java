//Weinan
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class StartReturningBehavior implements Behavior {

	public boolean takeControl() {
		if (Attributes.parked)
			return Attributes.getBluetoothMessage() == (byte) 1;			
		return false;
	}

	public void action() {
		LCD.clear();
		LCD.drawString("Going Home", 1, 1);
		Attributes.parked = false;
		Motor.C.rotate(-450);
		Motor.B.rotate(50);
		Motor.C.rotate(650);
		Motor.B.rotate(-120);
		Motor.C.rotate(600);
		
		Motor.B.rotate(70);
		//Motor.C.rotate(460);
		Motor.C.rotate((int) (Attributes.totalTachoCount * (-1)));
		System.exit(1);
	}

	public void suppress() {
	}

}
