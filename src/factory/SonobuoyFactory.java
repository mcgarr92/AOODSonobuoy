package factory;

import comms.CommManager;
import controls.Controls;
import sensors.Sensors;

public interface SonobuoyFactory {
    Controls createControls();
    Sensors createSensors();
    CommManager createComms();
}