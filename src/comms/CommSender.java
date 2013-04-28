package comms;

import java.util.ArrayList;

/**
 * The CommSender class keeps track of who is registered for a message and will
 * also send messages out.
 */
public class CommSender
{
    private ArrayList<CommReceiver> messageReceivers;
    private String name;

    /**
     * Constructor.
     *
     * @param name: Name of CommSender
     */
    public CommSender(String name)
    {
        messageReceivers = new ArrayList();
        this.name = name;
    }

    /**
     * Send a message to all objects registered for this message.
     *
     * @param m: Message being sent.
     */
    public void sendMessage(Message m)
    {
        for(int i = 0; i < messageReceivers.size(); i++)
        {
            messageReceivers.get(i).receiveMessage(m);
            System.out.println("Message sent from " + getName() + " to " + messageReceivers.get(i).getName() + "!");
        }
    }

    /**
     * Registers an object to receive a message.
     *
     * @param recClass: CommReceiver registering for message.
     */
    public void registerForMessage(CommReceiver recClass)
    {
        if(!messageReceivers.contains(recClass))
        {
            messageReceivers.add(recClass);
            System.out.println(recClass.getName() + " added to receiver list!");
        }
        else
        {
            System.out.println(recClass.getName() + " not added to receiver list!");
        }
    }

    /**
     * Deregister an object so it won't receive any more messages from this
     * object.
     *
     * @param recClass: CommReceiver that receives message.
     */
    public void deregisterForMessage(CommReceiver recClass)
    {
        if(messageReceivers.remove(recClass))
        {
            System.out.println(recClass.getName() + " removed! Size = " + messageReceivers.size());
        }
        else
        {
            System.out.println(recClass.getName() + " not removed!");
        }
    }

    /*
     * Returns the name given to this CommSender object.
     * @return name: Name of CommSender.
     */
    public String getName()
    {
        return name;
    }
}