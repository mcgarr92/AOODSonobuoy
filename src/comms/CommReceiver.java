package comms;

import java.util.ArrayList;

/**
 * The CommREceiver class receives messages from the CommSender class.
 */
public class CommReceiver
{
    private String name;
    ArrayList<Message> messages;

    /**
     * Constructor
     * @param parent: Sonobuoy object that contains this CommReceiver
     * @param name: Name of CommReceiver
     */
    public CommReceiver(String name)
    {
        this.name = name;
        this.messages = new ArrayList<Message>();
    }

    /**
     * Receives message from CommSenderClass
     * @param m: Message received.
     */
    public void receiveMessage(Message m)
    {
        messages.add(m);
    }
    
    public boolean messagePending() {
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

    Message getNextMessage() {
        return this.messages.remove(0);
    }
}