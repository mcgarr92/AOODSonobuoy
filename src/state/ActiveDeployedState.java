/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

class ActiveDeployedState implements State {

    @Override
    public void processMessage(Message nextMessage) {
        throw new UnsupportedOperationException("Active Deployed Process Message Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls) {
        displayStateName();
        throw new UnsupportedOperationException("Active Deployed State not supported yet.");
    }
    
    @Override
    public void displayStateName()
    {
        System.out.println("5. Active Deployed State");
    }
    
}
