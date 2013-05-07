package state;

import comms.CommManagerFacade;
import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

/**
 * This class represents the Active Deployed State 
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
class ActiveDeployedState implements State {

       /*
        * Processes the inbound message
        * @param Message nextMessage
        */
	@Override
	public void processMessage(Message nextMessage) {
		throw new UnsupportedOperationException("Active Deployed Process Message Not supported yet.");
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
		controls.generateSound();
		System.out.println("\t\tGenerating sound");
		if(sensors.listenForEcho())
                {
                    Message mess = new Message(sensors.getDepth(), sensors.getXPosition(), sensors.getYPosition(), sensors.getZPosition(),
                                            270, sensors.getWaterTemperature());
                    comms.sendMessage(mess);
                    System.out.println("\t\tMessage sent!");
                }
		System.out.println("\t\tListening for echo");
	}

        /*
         * Display the current state name
         */
	@Override
	public void displayStateName() {
		System.out.println("5. Active Deployed State");
	}
}
