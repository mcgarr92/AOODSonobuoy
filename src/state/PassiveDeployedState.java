/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

class PassiveDeployedState implements State {

    @Override
    public void processMessage(Message nextMessage) {
        throw new UnsupportedOperationException("Passive Deployed Process Message Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls) {
        displayStateName();
        //stateManager.trasitionToNextState();
        throw new UnsupportedOperationException("Passive Deployed State not supported yet.");
    }
    
    @Override
    public void displayStateName()
    {
        System.out.println("5. Passive Deployed State");
    }
}
