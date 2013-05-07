package state;

import comms.CommManagerFacade;
import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

/**
 * This class represents the Passive Deployed State 
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
class PassiveDeployedState implements State {

    /*
     * Processes the inbound message
     * @param Message nextMessage
     */
    @Override
    public void processMessage(Message nextMessage) {
        throw new UnsupportedOperationException("Passive Deployed Process Message Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
     * Perform active processing (common to every state)
     * Depending on the processing required, the facades are provided
     * to enable to usage of various sensors, controls and communications
     * @param SensorManagerFacade sensors 
     * @param ControlsFacade controls 
     * @param CommManagerFacade comms
     */
    @Override
    public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls, CommManagerFacade comms) {
        displayStateName();
        //stateManager.trasitionToNextState();
        throw new UnsupportedOperationException("Passive Deployed State not supported yet.");
    }
    
    /*
     * Display the current state name
     */
    @Override
    public void displayStateName()
    {
        System.out.println("5. Passive Deployed State");
    }
}
