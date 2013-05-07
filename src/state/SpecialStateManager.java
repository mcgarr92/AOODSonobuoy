package state;

/**
 * This class represents the Special State Manager 
 * @author Ben Hample
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class SpecialStateManager extends StateManager {
    private SpecialDeployedState deployedState;
    
    /*
     * Constructor
     */
    public SpecialStateManager() {
        deployedState = new SpecialDeployedState();
        states.add(deployedState);
    }
}
