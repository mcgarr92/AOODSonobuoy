/**
 * Kevin McGarry
 */

package sensors;

public class SpecialSensorManager implements SensorManagerFacade {

	private final DepthSensor depthSensor;
	private final LocationManager locationManager;
	private final SoundSensor soundSensor;
	private final WaterDetector waterDetector;
	private final WaterTemperatureSensor waterTemperature;

	public SpecialSensorManager() {
		waterDetector = new WaterDetector();
		depthSensor = new DepthSensor();
		locationManager = new LocationManager();
		soundSensor = new SoundSensor();
		waterTemperature = new WaterTemperatureSensor();
	}

	@Override
	public double getDepth() {
		return this.depthSensor.getDepth();
	}

	@Override
	public int getXPosition() {
		return this.locationManager.getXPosition();
	}

	@Override
	public int getYPosition() {
		return this.locationManager.getYPosition();
	}

	@Override
	public int getZPosition() {
		return this.locationManager.getZPosition();
	}

	@Override
	public double getLatitude() {
		return this.locationManager.getLatitude();
	}

	@Override
	public double getLongitude() {
		return this.locationManager.getLongitude();
	}

	@Override
	public double getAltitude() {
		return this.locationManager.getAltitude();
	}

	@Override
	public boolean inWater() {
		return this.waterDetector.inWater();
	}

	@Override
	public float getWaterTemperature() {
		return this.waterTemperature.getWaterTemperatureInFahrenheit();
	}

	@Override
	public boolean listenForEcho() {
		return false;
	}

	@Override
	public void listenForEnvironmentSounds() {
		// TODO: implement
	}
}
