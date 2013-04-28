/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import controls.ControlsFacade;
import sensors.SensorManagerFacade;

public interface StateManagerFacade {

    State getCurrentState();
    
}