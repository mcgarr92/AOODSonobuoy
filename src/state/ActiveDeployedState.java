package state;

import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

class ActiveDeployedState implements State {

	@Override
	public void processMessage(Message nextMessage) {
		throw new UnsupportedOperationException("Active Deployed Process Message Not supported yet.");
	}

	@Override
	public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls) {
		displayStateName();
		controls.generateSound();
		System.out.println("\t\tGenerating sound");
		sensors.listenForEcho();
		System.out.println("\t\tListening for echo");
	}

	@Override
	public void displayStateName() {
		System.out.println("5. Active Deployed State");
	}
}
