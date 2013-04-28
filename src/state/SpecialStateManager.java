/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.ArrayList;

public class SpecialStateManager extends StateManager {
    private ActiveDeployedState deployedState;
    
    public SpecialStateManager() {
        deployedState = new ActiveDeployedState();
        states.add(deployedState);
    }
}
