package state;

import comms.CommManagerFacade;
import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

/**
 * This class represents the Pre-deployed state common to all Sonobuoy types 
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class PreDeployState implements State {

	StateManagerControl stateManager;
	private double lastAltitude;

        /*
         * Constructor
         * @param StateManagerControl sm
         */
	PreDeployState(StateManagerControl sm) {
		this.stateManager = sm;
		this.lastAltitude = 0;
	}

       /*
        * Processes the inbound message
        * @param Message nextMessage
        */
	@Override
	public void processMessage(Message nextMessage) {
		throw new UnsupportedOperationException("Not supported yet.");
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
		if (sensors.inWater()) {
			System.out.println("\t\tWater detected!");
			stateManager.transitionToNextState();
		}
		else {
			System.out.println("\t\tNot in water!");
		}
	}

        /*
         * Display the current state name
         */
	@Override
	public void displayStateName() {
		System.out.println("1. Pre-Deploy State");
	}
}
