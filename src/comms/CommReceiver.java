package comms;

import sonobuoy.Sonobuoy;

/**
 * The CommREceiver class receives messages from the CommSender class.
 */
public class CommReceiver
{
    private String name;
    private Sonobuoy parent;

    /**
     * Constructor
     * @param parent: Sonobuoy object that contains this CommReceiver
     * @param name: Name of CommReceiver
     */
    public CommReceiver(Sonobuoy parent, String name)
    {
        this.parent = parent;
        this.name = name;
    }

    /**
     * Receives message from CommSenderClass
     * @param m: Message received.
     */
    public void receiveMessage(Message m)
    {
        parent.recieveMessage(m);
    }

    /*
     * Returns the name given to this CommSenderClass object.
     * @return name: Name of CommSenderClass.
     */
    public String getName()
    {
        return name;
    }
}