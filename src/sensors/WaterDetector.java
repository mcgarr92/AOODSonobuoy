package sensors;

/**
 * Detects the presence of water
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class WaterDetector {

	private boolean waterDetected;
	private int callCount;

	/**
	 * Returns true if sonobuoy is in water. Currently configured for
	 * simulation
	 * @return boolean: waterDetected
	 */
	boolean inWater() {
		callCount++;
		if (callCount > 10) {
			waterDetected = true;
		}
		return waterDetected;
	}
}
