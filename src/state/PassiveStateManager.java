/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class PassiveStateManager extends StateManager {
    private PassiveDeployedState deployedState;
    
    public PassiveStateManager() {
        deployedState = new PassiveDeployedState();
        states.add(deployedState);
    }
}
