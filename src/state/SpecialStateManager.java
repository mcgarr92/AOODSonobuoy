/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class SpecialStateManager extends StateManager {
    private SpecialDeployedState deployedState;
    
    public SpecialStateManager() {
        deployedState = new SpecialDeployedState();
        states.add(deployedState);
    }
}
