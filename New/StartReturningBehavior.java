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
		Motor.B.rotate(-90);
		Motor.C.rotate(-180);
		for (int i = 1; i <= 2; i++) {
			Motor.B.rotate(-40);
			Motor.C.rotate(120);
		}
		Motor.B.rotate(-90);
		Motor.C.rotate(460);
		Motor.B.rotate(35);
		Motor.C.rotate((int) (Attributes.totalTachoCount * (-1)));
	}

	public void suppress() {
	}

}
