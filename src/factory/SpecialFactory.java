/**
 * Kevin McGarry
 */

package factory;

import comms.Antenna;
import comms.CommManagerFacade;
import controls.SpecialControls;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;
import sensors.SpecialSensorManager;
import state.SpecialStateManager;
import state.StateManagerFacade;

/**
 * This class represents an Special Factory which creates components related 
 * to any Special Sonobuoy
 * @author Jon Palka
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class SpecialFactory implements SonobuoyFactory {

    /**
     * Constructor
     */
    public SpecialFactory() {
    }

    /**
     * Creates an Passive controller and returns access to it
     * @return controls facade
     */
    @Override
    public ControlsFacade createControls() {
    	return new SpecialControls();
    }

    /**
     * Creates a new Sensor manager and returns access to it
     * @return sensor facade
     */
    @Override
    public SensorManagerFacade createSensors() {
    	return new SpecialSensorManager();
    }

    /**
     * Creates a new Antenna for communication and returns access to it
     * @return comm facade
     */
    @Override
    public CommManagerFacade createComms() {
    	return new Antenna();
    }

    /**
     * Creates the PassiveState Manager and returns access to it
     * @return state facade
     */
    @Override
    public StateManagerFacade createState() {
    	return new SpecialStateManager();
    }
}
