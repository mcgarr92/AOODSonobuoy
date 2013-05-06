/**
 * Kevin McGarry
 */

package sensors;

public class LocationManager {

	private int x = 0;
	private int y = 0;
	private int z = 0;
	private double lat;
	private double lon;
	private double altitude;
	private int altitudeCallCount;

	/**
	 *
	 * @return x position
	 */
	public int getXPosition() {
		return this.x;
	}

	/**
	 *
	 * @return y position
	 */
	public int getYPosition() {
		return this.y;
	}

	/**
	 *
	 * @return z position
	 */
	public int getZPosition() {
		return this.z;
	}

	/**
	 *
	 * @return latitude
	 */
	public double getLatitude() {
		return this.lat;
	}

	/**
	 *
	 * @return longitude
	 */
	public double getLongitude() {
		return this.lon;
	}

	/**
	 *	
	 * @return altitude
	 */
	public double getAltitude() {
		return this.altitude;
	}


	/**
	 *	
	 * @return
	 */
	private void updatePosition() {
		//determine the XYZ position of the sonobuoy
	}
}
