package main;

import comms.CommManagerFacade;
import controls.ControlsFacade;
import factory.SonobuoyFactory;
import sensors.SensorManagerFacade;
import state.StateManagerFacade;

/**
 *
 * @author Kevin
 */
public class Sonobuoy {

    private final String name;
    ControlsFacade controls;
    SensorManagerFacade sensors;
    CommManagerFacade comms;
    StateManagerFacade state;

    public Sonobuoy(SonobuoyFactory factory, String n) {
        this.name = n;
        controls = factory.createControls();
        sensors = factory.createSensors();
        comms = factory.createComms();
        state = factory.createState();
        
        state.setSensors(sensors);
        state.setControls(controls);
    }
    
    public String getName() {
        return this.name;
    }

    void run() {
        while (true) {
            state.getCurrentState().performActiveProcessing();
        }
    }
}