package factory;

import comms.CommManagerFacade;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;
import state.StateManagerFacade;

/**
 * This class represents an interface for all Sonobuoy Factories regardless 
 * of type. It provides the basics needed for any Sonobuoy
 * @author Jon Palka
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public interface SonobuoyFactory {
    public ControlsFacade createControls();
    public SensorManagerFacade createSensors();
    public CommManagerFacade createComms();
    public StateManagerFacade createState();
}