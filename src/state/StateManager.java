/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.ArrayList;

public class StateManager implements StateManagerFacade, StateManagerControl {

    protected final PreDeployState preDeployState;
    protected final SinkingState sinkingState;
    protected final ReleasingState releasingState;
    protected final UnfoldingState unfoldingState;
    private int currentState;
    protected ArrayList<State> states;

    public StateManager() {
        preDeployState = new PreDeployState(this);
        sinkingState = new SinkingState(this);
        releasingState = new ReleasingState(this);
        unfoldingState = new UnfoldingState(this);

        states = new ArrayList<State>();
        states.add(this.preDeployState);
        states.add(this.sinkingState);
        states.add(this.releasingState);
        states.add(this.unfoldingState);

        currentState = 0;
    }

    @Override
    public State getCurrentState() {
        return this.states.get(currentState);
    }

    @Override
    public void trasitionToNextState() {
        if (this.currentState < states.size())
            this.currentState++;
    }
}