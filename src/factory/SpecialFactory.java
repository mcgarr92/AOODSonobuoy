package factory;

import comms.Antenna;
import comms.CommManagerFacade;
import controls.SpecialControls;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;
import sensors.SpecialSensorManager;
import state.SpecialStateManager;
import state.StateManagerFacade;

public class SpecialFactory implements SonobuoyFactory {

	/**
	 * Constructor
	 */
	public SpecialFactory() {
	}

	/**
	 *
	 * @return control facade
	 */
	@Override
	public ControlsFacade createControls() {
		return new SpecialControls();
	}

	/**
	 *
	 * @return sensor facade
	 */
	@Override
	public SensorManagerFacade createSensors() {
		return new SpecialSensorManager();
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
		return new SpecialStateManager();
	}
}
