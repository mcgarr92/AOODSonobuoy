package main;

import comms.CommManagerFacade;
import controls.Controls;
import factory.SonobuoyFactory;
import sensors.SensorManagerFacade;
import state.StateManagerFacade;

/**
 *
 * @author Kevin
 */
public class Application {

    Controls controls;
    SensorManagerFacade sensors;
    CommManagerFacade comms;
    StateManagerFacade state;

    public Application(SonobuoyFactory factory) {
        controls = factory.createControls();
        sensors = factory.createSensors();
        comms = factory.createComms();
        state = factory.createState();
    }
}