package factory;

import comms.CommManager;
import controls.Controls;
import sensors.ActiveSensorManager;

/**
 *
 * @author Kevin
 */
public class PassiveFactory implements SonobuoyFactory {

    public PassiveFactory() {
    }

    @Override
    public Controls createControls() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ActiveSensorManager createSensors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CommManager createComms() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
