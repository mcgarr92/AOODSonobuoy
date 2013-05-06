/**
 * Kevin McGarry
 */

package sensors;

public class WaterDetector {

	private boolean waterDetected;
	private int callCount;

	/**
	 * Returns true if sonobuoy is in water. Currently configured for
	 * simulation
	 * 
	 * @return waterDetected
	 */
	boolean inWater() {
		callCount++;
		if (callCount > 10) {
			waterDetected = true;
		}
		return waterDetected;
	}
}
