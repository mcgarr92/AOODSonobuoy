package factory;

import comms.Antenna;
import comms.CommManagerFacade;
import controls.Controls;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;
import sensors.SpecialSensorManager;
import state.SpecialStateManager;
import state.StateManagerFacade;

/**
 *
 * @author Kevin
 */
public class SpecialFactory implements SonobuoyFactory {

    public SpecialFactory() {
    }

    @Override
    public ControlsFacade createControls() {
        return new Controls();
    }

    @Override
    public SensorManagerFacade createSensors() {
        return new SpecialSensorManager();
    }

    @Override
    public CommManagerFacade createComms() {
        return new Antenna();
    }

    @Override
    public StateManagerFacade createState() {
        return new SpecialStateManager();
    }
}
