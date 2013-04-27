package factory;

import comms.CommManager;
import controls.Controls;
import sensors.DepthSensor;
import sensors.ActiveSensorManager;
import sensors.SensorManagerFacade;
import sensors.SoundSensor;

/**
 *
 * @author Kevin
 */
public class ActiveFactory implements SonobuoyFactory {

    public ActiveFactory() {
    }

    @Override
    public Controls createControls() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SensorManagerFacade createSensors() {
        return new ActiveSensorManager();
    }

    @Override
    public CommManager createComms() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
