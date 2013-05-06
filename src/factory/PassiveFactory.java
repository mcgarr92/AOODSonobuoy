/**
 * Kevin McGarry
 */

package factory;

import comms.Antenna;
import comms.CommManagerFacade;
import controls.PassiveControls;
import controls.ControlsFacade;
import sensors.PassiveSensorManager;
import sensors.SensorManagerFacade;
import state.PassiveStateManager;
import state.StateManagerFacade;

/**
 * This class represents an Passive Factory which creates components related 
 * to any Passive Sonobuoy
 * @author Jon Palka
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class PassiveFactory implements SonobuoyFactory {

	/**
	 * Constructor
	 */
	public PassiveFactory() {
	}

    /**
     * Creates an Passive controller and returns access to it
     * @return controls facade
     */
    @Override
    public ControlsFacade createControls() {
    	return new PassiveControls();
    }

    /**
     * Creates a new Sensor manager and returns access to it
     * @return sensor facade
     */
    @Override
    public SensorManagerFacade createSensors() {
    	return new PassiveSensorManager();
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
    	return new PassiveStateManager();
    }
}
