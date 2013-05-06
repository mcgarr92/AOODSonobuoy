/**
 * Kevin McGarry
 */

package sensors;

/**
 * Provides abstract access to sensor modules
 */
public interface SensorManagerFacade {

	/**
	 *
	 * @return depth
	 */
	public double getDepth();

	/**
	 *
	 * @return X position
	 */
	public int getXPosition();

	/**
	 *
	 * @return Y position
	 */
	public int getYPosition();

	/**
	 *
	 * @return Z position
	 */
	public int getZPosition();

	/**
	 *
	 * @return Latitude
	 */
	public double getLatitude();

	/**
	 *
	 * @return Longitude
	 */
	public double getLongitude();

	/**
	 *
	 * @return Altitude
	 */
	public double getAltitude();

	/**
	 * Returns true if sonobuoy is in water. Currently configured for
	 * simulation
	 *
	 * @return waterDetected
	 */
	public boolean inWater();

	/**
	 *
	 * @return Water Temperature
	 */
	public float getWaterTemperature();

	/**
	 * Listens for echo from generated sound.
	 */
	public boolean listenForEcho();

	/**
	 * Listens for environment sounds.
	 */
	public void listenForEnviornmentSounds();
}
