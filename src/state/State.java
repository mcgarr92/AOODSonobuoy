package state;

import comms.CommManagerFacade;
import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

/**
 * This class represents the State interface (common to all states) 
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public interface State {

    	/*
         * Processes the inbound message
         * @param Message nextMessage
         */
	public void processMessage(Message nextMessage);

    	/*
         * Perform active processing (common to every state)
         * Depending on the processing required, the facades are provided
         * to enable to usage of various sensors, controls and communications
         * @param SensorManagerFacade sensors 
         * @param ControlsFacade controls 
         * @param CommManagerFacade comms
         */
	public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls, CommManagerFacade comms);
    
    	/*
         * Display the current state name
         */
	public void displayStateName();
}