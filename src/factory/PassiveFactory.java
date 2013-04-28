package factory;

import comms.Antenna;
import comms.CommManagerFacade;
import controls.Controls;
import controls.ControlsFacade;
import sensors.PassiveSensorManager;
import sensors.SensorManagerFacade;
import state.PassiveStateManager;
import state.StateManagerFacade;

/**
 *
 * @author Kevin
 */
public class PassiveFactory implements SonobuoyFactory {

    public PassiveFactory() {
    }

    @Override
    public ControlsFacade createControls() {
        return new Controls();
    }

    @Override
    public SensorManagerFacade createSensors() {
        return new PassiveSensorManager();
    }

    @Override
    public CommManagerFacade createComms() {
        return new Antenna();
    }

    @Override
    public StateManagerFacade createState() {
        return new PassiveStateManager();
    }
}
