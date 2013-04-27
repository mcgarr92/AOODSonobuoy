/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class StateManager implements StateManagerFacade, StateManagerControl {
    private final PreDeployState preDeployState;
    private final SinkingState sinkingState;
    private final ReleasingState releasingState;
    private final UnfoldingState unfoldingState;
    private final DeployedState deployedState;
    
    private final State currentState;
    
    public StateManager() {
        preDeployState = new PreDeployState(this);
        sinkingState = new SinkingState(this);
        releasingState = new ReleasingState(this);
        unfoldingState = new UnfoldingState(this);
        deployedState = new DeployedState(this);
        
        currentState = this.preDeployState;
    }
    
    @Override
    public State getCurrentState() {
        return this.currentState;
    }
    
    @Override
    public void trasitionToNextState() {
        
    }
    
}
