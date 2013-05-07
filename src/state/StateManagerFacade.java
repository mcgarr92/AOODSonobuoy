package state;

import controls.ControlsFacade;
import sensors.SensorManagerFacade;

/**
 * This class represents the State Manager Facade 
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public interface StateManagerFacade {

    /*
     * Get the current state
     * @return State
     */
    State getCurrentState();
    
}