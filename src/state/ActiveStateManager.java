/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class ActiveStateManager extends StateManager {
    private ActiveDeployedState deployedState;
    
    public ActiveStateManager() {
        deployedState = new ActiveDeployedState();
        states.add(deployedState);
    }
}
