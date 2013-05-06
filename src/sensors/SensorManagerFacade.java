package sensors;

/**
 * Provides abstract access to sensor modules
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public interface SensorManagerFacade {

	/*
         * Get the current depth
         * @return double: depth
         */
	public double getDepth();

	/*
         * Get the X position
         * @return int: x position
         */
	public int getXPosition();

	/*
         * Get the Y position
         * @return int: Y position
         */
	public int getYPosition();

	/*
         * Get the Z position
         * @return int: Z position
         */
	public int getZPosition();

	/*
         * Get the latitude
         * @return double: latitude
         */
	public double getLatitude();

	/*
         * Get the longitude
         * @return double: longitude
         */
	public double getLongitude();

	/*
         * Get the altitude
         * @return double: altitude
         */
	public double getAltitude();

        /*
         * Determine if the Sonobuoy is in the water 
         * (Currently configured for simulation)
         * @return boolean: inWater
         */
	public boolean inWater();

	/*
         * Get the water temperature
         * @return float: water temperature
         */
	public float getWaterTemperature();

	/*
         * Listen for an echo and return true or false
         * @return boolean: echo returned
         */
	public boolean listenForEcho();

	/**
	 * Listen for environment sounds.
	 */
	public void listenForEnvironmentSounds();
}
