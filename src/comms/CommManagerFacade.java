package comms;
/*
 * Provides an interface to the CommSender and CommReceiver classes.
 * @author Jon Palka
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public interface CommManagerFacade {

    /**
     * Calls the CommSender to deregister an object so it won't receive
     * any more messages from this object.
     * @param recClass: CommReceiver that receives message.
     */
    public void deregisterForMessage(CommReceiver recClass);

    /**
     * Receives message and passes it to the CommReceiver.
     * @param m: Message received.
     */
    public void receiveMessage(Message m);

    /**
     * Calls the CommSender to register a CommReceiver.
     * @param recClass: CommReceiver registering for message.
     */
    public void registerForMessage(CommReceiver recClass);

    /**
     * Calls the CommSender to send a message out.
     * @param m: Message being sent.
     */
    public void sendMessage(Message m);

    /*
     * Determines if a message is waiting to be processed in the queue
     * @return boolean: message pending indicator
     */
    public boolean messagePending();
    
    /*
     * Gets the current message in the queue
     * @return Message
     */
    public Message getNextMessage();
    
}
