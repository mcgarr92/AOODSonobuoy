package factory;

import comms.Antenna;
import comms.CommManagerFacade;
import controls.Controls;
import controls.ControlsFacade;
import sensors.ActiveSensorManager;
import sensors.SensorManagerFacade;
import state.ActiveStateManager;
import state.StateManagerFacade;

/**
 *
 * @author Kevin
 */
public class ActiveFactory implements SonobuoyFactory {

    public ActiveFactory() {
    }

    @Override
    public ControlsFacade createControls() {
        return new Controls();
    }

    @Override
    public SensorManagerFacade createSensors() {
        return new ActiveSensorManager();
    }

    @Override
    public CommManagerFacade createComms() {
        return new Antenna();
    }

    @Override
    public StateManagerFacade createState() {
        return new ActiveStateManager();
    }
}