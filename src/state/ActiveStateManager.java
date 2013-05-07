package state;

/**
 * This class represents the Active State Manager  specifically for the
 * Active Deployed State
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class ActiveStateManager extends StateManager {
    private ActiveDeployedState deployedState;
    
    /*
     * Constructor
     */
    public ActiveStateManager() {
        deployedState = new ActiveDeployedState();
        states.add(deployedState);
    }
}
