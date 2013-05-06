/**
 * Kevin McGarry
 */

package factory;

import comms.Antenna;
import comms.CommManagerFacade;
import controls.ActiveControls;
import controls.ControlsFacade;
import sensors.ActiveSensorManager;
import sensors.SensorManagerFacade;
import state.ActiveStateManager;
import state.StateManagerFacade;

/**
 * This class represents an Active Factory which creates components related 
 * to any Active Sonobuoy
 * @author Jon Palka
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class ActiveFactory implements SonobuoyFactory {

    /**
     * Constructor
     */
    public ActiveFactory() {
    }

    /**
     * Creates an Active controller and returns access to it
     * @return controls facade
     */
    @Override
    public ControlsFacade createControls() {
        return new ActiveControls();
    }

    /**
     * Creates a new Sensor manager and returns access to it
     * @return sensor facade
     */
    @Override
    public SensorManagerFacade createSensors() {
        return new ActiveSensorManager();
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
     * Creates the ActiveState Manager and returns access to it
     * @return state facade
     */
    @Override
    public StateManagerFacade createState() {
        return new ActiveStateManager();
    }
}
