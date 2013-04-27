package factory;

import comms.CommManager;
import controls.Controls;
import sensors.ActiveSensorManager;
import sensors.SensorManagerFacade;
import state.StateManager;
import state.StateManagerFacade;

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

    @Override
    public StateManagerFacade createState() {
        return new StateManager();
    }
}