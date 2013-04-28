/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

class SpecialDeployedState implements State {

    @Override
    public void processMessage(Message nextMessage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
