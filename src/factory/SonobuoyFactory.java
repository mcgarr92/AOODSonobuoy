package factory;

import comms.CommManagerFacade;
import controls.Controls;
import sensors.SensorManagerFacade;
import state.StateManagerFacade;

public interface SonobuoyFactory {
    public Controls createControls();
    public SensorManagerFacade createSensors();
    public CommManagerFacade createComms();
    public StateManagerFacade createState();
}