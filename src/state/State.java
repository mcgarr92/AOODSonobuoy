/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import comms.CommManagerFacade;
import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;


public interface State {

    	/**
	 * Processes next incoming message
	 * 
	 * @param nextMessage
	 */
	public void processMessage(Message nextMessage);

    	/**
	 * Perform processing. Implementation provided by concrete state.
	 * 
	 * @param sensors
	 * @param controls
         * @param comms
	 */
	public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls, CommManagerFacade comms);
    
    	/**
	 * Prints name of current state.
	 */
	public void displayStateName();
}