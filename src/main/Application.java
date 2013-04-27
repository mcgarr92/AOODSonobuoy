package main;

import comms.CommManagerFacade;
import controls.Controls;
import factory.SonobuoyFactory;
import sensors.SensorManagerFacade;

/**
 *
 * @author Kevin
 */
public class Application {

    Controls controls;
    SensorManagerFacade sensors;
    CommManagerFacade comms;

    public Application(SonobuoyFactory factory) {
        controls = factory.createControls();
        sensors = factory.createSensors();
        comms = factory.createComms();
    }
}