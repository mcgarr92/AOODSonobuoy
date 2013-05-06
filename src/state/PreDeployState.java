/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import comms.CommManagerFacade;
import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

/**
 *
 * @author Kevin
 */
public class PreDeployState implements State {

	StateManagerControl stateManager;
	private double lastAltitude;

	PreDeployState(StateManagerControl sm) {
		this.stateManager = sm;
		this.lastAltitude = 0;
	}

	@Override
	public void processMessage(Message nextMessage) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

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

	@Override
	public void displayStateName() {
		System.out.println("1. Pre-Deploy State");
	}
}
