package state;

import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

public class SinkingState implements State {

	StateManagerControl stateManager;

	SinkingState(StateManagerControl sm) {
		this.stateManager = sm;
	}

	@Override
	public void processMessage(Message nextMessage) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls) {
		displayStateName();
		System.out.println("\t\tDepth = " + sensors.getDepth());
		if (sensors.getDepth() >= 20) { // TODO: make max depth configurable
			stateManager.transitionToNextState();
		}
	}

	@Override
	public void displayStateName() {
		System.out.println("2. Sinking State");
	}
}
