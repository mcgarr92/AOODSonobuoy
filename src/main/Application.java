package main;

import comms.CommManager;
import controls.Controls;
import factory.SonobuoyFactory;
import sensors.Sensors;

/**
 *
 * @author Kevin
 */
public class Application {
    public Application(SonobuoyFactory factory) {
        Controls controls = factory.createControls();
        Sensors sensors = factory.createSensors();
        CommManager comms = factory.createComms();
    }
}