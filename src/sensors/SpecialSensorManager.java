package sensors;

/**
 *
 * @author Kevin
 */
public class SpecialSensorManager implements SensorManagerFacade {
    private final DepthSensor depthSensor;
    private final LocationManager locationManager;
    public SpecialSensorManager() {
        depthSensor = new DepthSensor();
        locationManager = new LocationManager();
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

}
