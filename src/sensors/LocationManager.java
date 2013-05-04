/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
	 * @return
	 */
	public int getXPosition() {
		return this.x;
	}

	/**
	 *
	 * @return
	 */
	public int getYPosition() {
		return this.y;
	}

	/**
	 *
	 * @return
	 */
	public int getZPosition() {
		return this.z;
	}

	/**
	 *
	 * @return
	 */
	public double getLatitude() {
		return this.lat;
	}

	/**
	 *
	 * @return
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

	private void updatePosition() {
		//determine the XYZ position of the sonobuoy
	}
}
