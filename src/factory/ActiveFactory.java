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

public class ActiveFactory implements SonobuoyFactory {

    	/**
	 * Constructor
	 */
	public ActiveFactory() {
    }

    	/**
	 *
	 * @return controls facade
	 */
	@Override
    public ControlsFacade createControls() {
        return new ActiveControls();
    }

    	/**
	 *
	 * @return sensor facade
	 */
	@Override
    public SensorManagerFacade createSensors() {
        return new ActiveSensorManager();
    }

    	/**
	 *
	 * @return comm facade
	 */
	@Override
    public CommManagerFacade createComms() {
        return new Antenna();
    }

    	/**
	 *
	 * @return state facade
	 */
	@Override
    public StateManagerFacade createState() {
        return new ActiveStateManager();
    }
}