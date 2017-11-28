import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.UltrasonicSensor;

public class Attributes {
	public static boolean isMeasuring = false;
	public static boolean enoughSpace = false;
	public static boolean firstStep = true;
	public static boolean parked = false;
	public static boolean finalStep = false;
	//public static SoundSensor soundSensor = new SoundSensor(SensorPort.S3);
	public static UltrasonicSensor ultrasonicSensor = new UltrasonicSensor(SensorPort.S4);
	
	
	public final static int CLAP_SOUND = 50; //Delete
	public final static int DISTANCE_CAR_ROBOT = 20;
	public final static float ROBOT_LENGHT =20;
	public final static int MOTOR_SPEED = 100;
	public final static double WHEEL_DIAMETER = 8.25;
}
