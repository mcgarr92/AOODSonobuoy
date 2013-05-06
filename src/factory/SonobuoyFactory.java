/**
 * Kevin McGarry
 */

package factory;

import comms.CommManagerFacade;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;
import state.StateManagerFacade;

public interface SonobuoyFactory {
    public ControlsFacade createControls();
    public SensorManagerFacade createSensors();
    public CommManagerFacade createComms();
    public StateManagerFacade createState();
}