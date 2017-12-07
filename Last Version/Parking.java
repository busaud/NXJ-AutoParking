
//Rahaf
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.Sound;
import lejos.robotics.subsumption.Behavior;

import lejos.util.Delay;

public class Parking implements Behavior {
	@Override
	public boolean takeControl() {
		return !Attributes.parked && Attributes.enoughSpace;
	}
	@Override
	public void action() {
		Attributes.totalTachoCount += Motor.C.getTachoCount();
		Motor.C.stop();
		Motor.C.rotate(100);
		LCD.drawString("Reverse Right", 1, 1);
		Motor.B.rotate(-60);
		Motor.C.rotate(-800);
		LCD.clear();
		LCD.drawString("Reverse Left", 1, 1);
		/*
		for (int i = 1; i <= 2; i++) {
			Motor.B.rotate(50);
			Motor.C.rotate(-450);
		}
		*/
		Motor.B.rotate(130); //70
		Motor.C.rotate(-550);
//		Delay.msDelay(100);
		Motor.C.stop();
		// set position
		Motor.B.rotate(-120); //-50
		Motor.C.rotate(180);
		Motor.B.rotate(50);
		Attributes.parked = true;
		LCD.clear();
		LCD.drawString("Tada!!", 1, 1);
		Sound.buzz();
		// Attributes.returning = true;
	}

	@Override

	public void suppress() {

		// TODO Auto-generated method stub

	}

}
