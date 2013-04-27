package factory;

import comms.CommManager;
import controls.Controls;
import sensors.ActiveSensorManager;
import state.StateManager;
import state.StateManagerFacade;

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
    public ActiveSensorManager createSensors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CommManager createComms() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public StateManagerFacade createState() {
        return new StateManager();
    }

}
