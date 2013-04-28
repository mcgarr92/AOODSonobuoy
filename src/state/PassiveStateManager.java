/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.ArrayList;

public class PassiveStateManager extends StateManager {
    private ActiveDeployedState deployedState;
    
    public PassiveStateManager() {
        deployedState = new ActiveDeployedState();
        states.add(deployedState);
    }
}
