package factory;

import comms.CommManager;
import controls.Controls;
import sensors.Sensors;

/**
 *
 * @author Kevin
 */
public class SpecialFactory implements SonobuoyFactory {

    public SpecialFactory() {
    }

    @Override
    public Controls createControls() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Sensors createSensors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CommManager createComms() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
