/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import comms.Message;

/**
 *
 * @author zone785
 */
public class Sonobuoy 
{
    //Private fields for all sonobuoys
    int state = 0; //initial state
    
    public int getCurrentState()
    {
        return state;
    }

    public void recieveMessage(Message m) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
