import java.io.DataInputStream;
import java.io.DataOutputStream;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.comm.BTConnection;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.NXTConnection;

public class Attributes {
	public static boolean isMeasuring = false;
	public static boolean enoughSpace = false;
	public static boolean parked = false;
	public static double totalTachoCount = 0;
	public static BTConnection bluetoothConnection;	
	public static DataInputStream dis;
	public static DataOutputStream dos;

	//public static SoundSensor soundSensor = new SoundSensor(SensorPort.S3);
	public static UltrasonicSensor ultrasonicSensor = new UltrasonicSensor(SensorPort.S4);
	
	
	public final static int CLAP_SOUND = 50; //Delete
	public final static int DISTANCE_CAR_ROBOT = 20;
	public final static float ROBOT_LENGHT =40;
	public final static int MOTOR_SPEED = 100;
	public final static double WHEEL_DIAMETER = 5.5;
	
	public static byte getBluetoothMessage() {
		byte[] buffer = {2};
		if(Attributes.bluetoothConnection != null && Attributes.bluetoothConnection.available() > 0) {
			Attributes.bluetoothConnection.read(buffer, 1);
		}
		return buffer[0];
	}
}
