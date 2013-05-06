package comms;

import java.util.ArrayList;

/**
 * The CommREceiver class receives messages from the CommSender class.
 * @author Jon Palka
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class CommReceiver
{
    private String name;
    ArrayList<Message> messages;

    /**
     * Constructor
     *
     * @param name:   Name of CommReceiver
     */
    public CommReceiver(String name)
    {
        this.name = name;
        this.messages = new ArrayList<Message>();
    }

    /**
     * Receives message from CommSenderClass
     *
     * @param m: Message received.
     */
    public void receiveMessage(Message m)
    {
        messages.add(m);
    }

    /*
     * Determines if a message is waiting to be processed in the queue
     */
    public boolean messagePending()
    {
        return messages.size() > 0;
    }

    /*
     * Returns the name given to this CommSenderClass object.
     * @return name: Name of CommSenderClass.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the next message that is waiting to be processed.
     *
     * @return Message: Message waiting to be processed.
     */
    public Message getNextMessage()
    {
        return this.messages.remove(0);
    }
}