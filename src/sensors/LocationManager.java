package sensors;

/**
 * This class provides functionality related to the 
 * location of the Sonobuoy
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class LocationManager {

	private int x = 0;
	private int y = 0;
	private int z = 0;
	private double lat;
	private double lon;
	private double altitude;
	private int altitudeCallCount;

	/**
	 * Get the X Position
	 * @return int: x position
	 */
	public int getXPosition() {
		return this.x;
	}

	/**
	 * Get the Y Position
	 * @return int: y position
	 */
	public int getYPosition() {
		return this.y;
	}

	/**
	 * Get the Z position
	 * @return int: z position
	 */
	public int getZPosition() {
		return this.z;
	}

	/**
	 * Get the Latitude
	 * @return double: latitude
	 */
	public double getLatitude() {
		return this.lat;
	}

	/**
	 * Get the Longitude
	 * @return double: longitude
	 */
	public double getLongitude() {
		return this.lon;
	}

	/**
	 * Get the altitude
	 * @return double: altitude
	 */
	public double getAltitude() {
		return this.altitude;
	}


	/**
	 * Update the position of the Sonobuoy
	 */
	private void updatePosition() {
		//determine the XYZ position of the sonobuoy
	}
}
