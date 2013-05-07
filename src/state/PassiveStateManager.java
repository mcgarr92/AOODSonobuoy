package state;

/**
 * This class represents the Passive State Manager 
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class PassiveStateManager extends StateManager {
    private PassiveDeployedState deployedState;
    
    /*
     * Constructor
     */
    public PassiveStateManager() {
        deployedState = new PassiveDeployedState();
        states.add(deployedState);
    }
}
