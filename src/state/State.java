/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

public interface State {

    public void processMessage(Message nextMessage);

    public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls);
    
    public void displayStateName();
}