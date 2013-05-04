package state;

import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

public class UnfoldingState implements State {

    StateManagerControl stateManager;

    UnfoldingState(StateManagerControl sm) {
        this.stateManager = sm;
    }

    @Override
    public void processMessage(Message nextMessage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls) {
        displayStateName();
	controls.unfold();
	System.out.println("\t\tUnfolding!");
        stateManager.transitionToNextState();
    }
    
    @Override
    public void displayStateName()
    {
        System.out.println("4. Unfolding State");
    }
}
