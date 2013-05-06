package comms;

/**
 * The Message provides an object in which data can be stored
 * and sent to other sonobuoy.
 * @author Jon Palka
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class Message
{
    private double depth;
    private int xCoord;
    private int yCoord;
    private int zCoord;
    private int bearingOfReturnSound;
    private float waterTemp;

    /**
     * Constructor
     * @param depth: Depth of sonobuoy.
     * @param xCoord: X coordinate of object detected.
     * @param yCoord: Y coordinate of object detected.
     * @param zCoord: Z coordinate of object detected.
     * @param bearingOfReturnSound: Bearing of return sound.
     * @param waterTemp: Water temperature.
     */
    public Message(double depth, int xCoord, int yCoord, int zCoord, int bearingOfReturnSound, float waterTemp)
    {
        this.depth = depth;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
        this.bearingOfReturnSound = bearingOfReturnSound;
        this.waterTemp = waterTemp;
    }

    /**
     * Copy constructor.
     * @param message: Message object to copy fields from.
     */
    public Message(Message message)
    {
        depth = message.getDepth();
        xCoord = message.getXCoord();
        yCoord = message.getyCoord();
        zCoord = message.getZCoord();
        bearingOfReturnSound = message.getBearing();
        waterTemp = message.getWaterTemp();
    }

    /**
     * Returns depth;
     * @return depth
     */
    public double getDepth()
    {
        return depth;
    }

    /**
     * Returns x coordinate of object detected.
     * @return xCoord
     */
    public int getXCoord()
    {
        return xCoord;
    }

    /**
     * Returns y coordinate of object detected.
     * @return yCoord
     */
    public int getyCoord()
    {
        return yCoord;
    }

    /**
     * Returns z coordinate of object detected.
     * @return zCoord
     */
    public int getZCoord()
    {
        return zCoord;
    }

    /**
     * Returns bearing of return sound.
     * @return bearingOfReturnSound
     */
    public int getBearing()
    {
        return bearingOfReturnSound;
    }

    /**
     * Returns water temperature
     * @return waterTemp
     */
    public float getWaterTemp()
    {
        return waterTemp;
    }

    /**
     * Sets depth
     * @param depth
     */
    public void setDepth(int depth)
    {
        this.depth = depth;
    }

    /**
     * Sets x coordinate of return sound.
     * @param xCoord
     */
    public void getXCoord(int xCoord)
    {
        this.xCoord = xCoord;
    }

    /**
     * Sets y coordinate of return sound.
     * @param yCoord
     */
    public void getyCoord(int yCoord)
    {
        this.yCoord = yCoord;
    }

    /**
     * Sets z coordinate of return sound.
     * @param zCoord
     */
    public void getZCoord(int zCoord)
    {
        this.zCoord = zCoord;
    }

    /**
     * Sets the bearing of return sound.
     * @param bearingOfReturnSound
     */
    public void setBearing(int bearing)
    {
        this.bearingOfReturnSound = bearing;
    }

    /**
     * Sets the water temperature
     * @param waterTemp
     */
    public void setWaterTemp(int waterTemp)
    {
        this.waterTemp = waterTemp;
    }
}