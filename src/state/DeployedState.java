/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

public class DeployedState implements State {

    StateManagerControl stateManager;

    DeployedState(StateManagerControl sm) {
        this.stateManager = sm;
    }

    @Override
    public void performActiveProcessing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}