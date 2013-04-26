package comms;

import sonobuoy.Sonobuoy;

/**
 * Provides an interface to the CommSender and CommReceiver classes.
 */
public class CommManager
{
    private CommSender commSender;
    private CommReceiver commReceiver;

    /**
     * Constructor
     * @param sonobouy: Sonobuoy containing this CommManager
     */
    public CommManager(Sonobuoy sonobuoy)
    {
        commSender = new CommSender(sonobuoy.getName() + " CommSender");
        commReceiver = new CommReceiver(sonobuoy, sonobuoy.getName() + " CommReceiver");
    }

    /**
     * Calls the CommSender to send a message out.
     * @param m: Message being sent.
     */
    public void sendMessage(Message m)
    {
        commSender.sendMessage(m);
    }

    /**
     * Calls the CommSender to register a CommReceiver.
     * @param recClass: CommReceiver registering for message.
     */
    public void registerForMessage(CommReceiver recClass)
    {
        commSender.registerForMessage(recClass);
    }

    /**
     * Calls the CommSender to deregister an object so it won't receive
     * any more messages from this object.
     * @param recClass: CommReceiver that receives message.
     */
    public void deregisterForMessage(CommReceiver recClass)
    {
        commSender.deregisterForMessage(recClass);
    }

    /**
     * Receives message and passes it to the CommReceiver.
     * @param m: Message received.
     */
    public void receiveMessage(Message m)
    {
        commReceiver.receiveMessage(m);
    }
}