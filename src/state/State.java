/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import comms.Message;

public interface State {
    public void performActiveProcessing();

    public void processMessage(Message nextMessage);
}