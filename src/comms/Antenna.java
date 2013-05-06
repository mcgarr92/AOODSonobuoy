package comms;

/**
 * This class represents an Antenna which is used for communication
 * (sending and receiving messages)
 * @author Jon Palka
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class Antenna implements CommManagerFacade {

    private CommSender commSender;
    private CommReceiver commReceiver;

    /**
     * Constructor
     *
     */
    public Antenna() {
        commSender = new CommSender("CommSender");
        commReceiver = new CommReceiver("CommReceiver");
    }

    /**
     * Calls the CommSender to send a message out.
     *
     * @param m: Message being sent.
     */
    @Override
    public void sendMessage(Message m) {
        commSender.sendMessage(m);
    }

    /**
     * Calls the CommSender to register a CommReceiver.
     *
     * @param recClass: CommReceiver registering for message.
     */
    @Override
    public void registerForMessage(CommReceiver recClass) {
        commSender.registerForMessage(recClass);
    }

    /**
     * Calls the CommSender to deregister an object so it won't receive any more
     * messages from this object.
     *
     * @param recClass: CommReceiver that receives message.
     */
    @Override
    public void deregisterForMessage(CommReceiver recClass) {
        commSender.deregisterForMessage(recClass);
    }

    /**
     * Receives message and passes it to the CommReceiver.
     *
     * @param m: Message received.
     */
    @Override
    public void receiveMessage(Message m) {
        commReceiver.receiveMessage(m);
    }

    /**
     * Checks to see if a message is pending.
     * @return true is message is pending, false otherwise.
     */
    @Override
    public boolean messagePending() {
        return commReceiver.messagePending();
    }

    /**
     * Gets the next message that is waiting to be processed.
     * @return Message: Message waiting to be processed.
     */
    @Override
    public Message getNextMessage() {
        return commReceiver.getNextMessage();
    }
}