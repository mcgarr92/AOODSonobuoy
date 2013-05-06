package main;

import comms.CommManagerFacade;
import controls.ControlsFacade;
import factory.SonobuoyFactory;
import sensors.SensorManagerFacade;
import state.StateManagerFacade;

/**
 * This class represents a Sonobuoy object (dynamically Active, Passive, or
 * Special purpose)
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class Sonobuoy {

    private final String name;
    ControlsFacade controls;
    SensorManagerFacade sensors;
    CommManagerFacade comms;
    StateManagerFacade state;

    /**
     * Constructor
     * @param SonobuoyFactory factory: specific factory for Sonobuoy type
     * @param String n: name of the Sonobuoy
     */
    public Sonobuoy(SonobuoyFactory factory, String n) {
        this.name = n;
        controls = factory.createControls();
        sensors = factory.createSensors();
        comms = factory.createComms();
        state = factory.createState();
    }
    
    /*
     * Gets the name of the Sonobuoy
     * @return String: name of Sonobuoy
     */
    public String getName() {
        return this.name;
    }

    /*
     * This method starts the Sonobuoy processing
     */
    void run() {
        System.out.println(this.getName() + " has started");
        while (true) {
            if (comms.messagePending()) {
                state.getCurrentState().processMessage(comms.getNextMessage());
            } else {
                state.getCurrentState().performActiveProcessing(sensors, controls, comms);
            }
        }
    }
}