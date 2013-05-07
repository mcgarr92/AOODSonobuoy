package sensors;

/**
 * This class represents the Special Sensor Manager 
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class SpecialSensorManager implements SensorManagerFacade {

	private final DepthSensor depthSensor;
	private final LocationManager locationManager;
	private final SoundSensor soundSensor;
	private final WaterDetector waterDetector;
	private final WaterTemperatureSensor waterTemperature;

        /*
         * Constructor
         */
	public SpecialSensorManager() {
		waterDetector = new WaterDetector();
		depthSensor = new DepthSensor();
		locationManager = new LocationManager();
		soundSensor = new SoundSensor();
		waterTemperature = new WaterTemperatureSensor();
	}

        /*
         * Get the current depth
         * @return double: depth
         */
	@Override
	public double getDepth() {
		return this.depthSensor.getDepth();
	}

        /*
         * Get the X position
         * @return int: x position
         */
	@Override
	public int getXPosition() {
		return this.locationManager.getXPosition();
	}

        /*
         * Get the Y position
         * @return int: y position
         */
	@Override
	public int getYPosition() {
		return this.locationManager.getYPosition();
	}

        /*
         * Get the Z position
         * @return int: z position
         */
	@Override
	public int getZPosition() {
		return this.locationManager.getZPosition();
	}

        /*
         * Get the latitude
         * @return double: latitude
         */
	@Override
	public double getLatitude() {
		return this.locationManager.getLatitude();
	}

        /*
         * Get the longitude
         * @return double: longitude
         */
	@Override
	public double getLongitude() {
		return this.locationManager.getLongitude();
	}

        /*
         * Get the altitude
         * @return double: altitude
         */
	@Override
	public double getAltitude() {
		return this.locationManager.getAltitude();
	}

        /*
         * Determine if the Sonobuoy is in the water
         * @return boolean: inWater
         */
	@Override
	public boolean inWater() {
		return this.waterDetector.inWater();
	}

        /*
         * Get the water temperature
         * @return float: water temperature
         */
	@Override
	public float getWaterTemperature() {
		return this.waterTemperature.getWaterTemperatureInFahrenheit();
	}

        /*
         * Listen for an echo and return true or false
         * @return boolean: echo returned
         */
	@Override
	public boolean listenForEcho() {
		return false;
	}

        /*
         * Listen for environment sounds
         */
	@Override
	public void listenForEnvironmentSounds() {
		// TODO: implement
	}
}
