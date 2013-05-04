package state;

import comms.Message;
import controls.ControlsFacade;
import sensors.SensorManagerFacade;

public class ReleasingState implements State {

    StateManagerControl stateManager;

    ReleasingState(StateManagerControl sm) {
        this.stateManager = sm;
    }

    @Override
    public void processMessage(Message nextMessage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void performActiveProcessing(SensorManagerFacade sensors, ControlsFacade controls) {
        displayStateName();
        stateManager.transitionToNextState();
    }
    
    @Override
    public void displayStateName()
    {
        System.out.println("3. Releasing State");
    }
}
