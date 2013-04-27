package factory;

import comms.CommManagerFacade;
import controls.Controls;
import sensors.SensorManagerFacade;

public interface SonobuoyFactory {
    Controls createControls();
    SensorManagerFacade createSensors();
    CommManagerFacade createComms();
}