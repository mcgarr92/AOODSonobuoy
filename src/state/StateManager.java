package state;

import java.util.ArrayList;

/**
 * This class manages the states of the sonobuoy. 
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class StateManager implements StateManagerFacade, StateManagerControl {

	protected final PreDeployState preDeployState;
	protected final SinkingState sinkingState;
	protected final ReleasingState releasingState;
	protected final UnfoldingState unfoldingState;
	private int currentState;
	protected ArrayList<State> states;

	/**
	 * Constructor.
	 */
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

	/**
	 * Used to retrieve current state object
	 * 
	 * @return Current State
	 */
	@Override
	public State getCurrentState() {
		return this.states.get(currentState);
	}

	/**
	 * Transitions to the next system state
	 */
	@Override
	public void transitionToNextState() {
		if (this.currentState < states.size()) {
			this.currentState++;
		}
	}
}