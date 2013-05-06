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

public class PassiveFactory implements SonobuoyFactory {

	/**
	 * Constructor
	 */
	public PassiveFactory() {
	}

	/**
	 *
	 * @return controls facade
	 */
	@Override
	public ControlsFacade createControls() {
		return new PassiveControls();
	}

	/**
	 *
	 * @return sensor facade
	 */
	@Override
	public SensorManagerFacade createSensors() {
		return new PassiveSensorManager();
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
		return new PassiveStateManager();
	}
}
