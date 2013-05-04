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
	 *
	 */
	public ActiveFactory() {
    }

    	/**
	 *
	 * @return
	 */
	@Override
    public ControlsFacade createControls() {
        return new ActiveControls();
    }

    	/**
	 *
	 * @return
	 */
	@Override
    public SensorManagerFacade createSensors() {
        return new ActiveSensorManager();
    }

    	/**
	 *
	 * @return
	 */
	@Override
    public CommManagerFacade createComms() {
        return new Antenna();
    }

    	/**
	 *
	 * @return
	 */
	@Override
    public StateManagerFacade createState() {
        return new ActiveStateManager();
    }
}