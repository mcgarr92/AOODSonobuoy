package controls;

/**
 * Class responsible for setting and retrieving sonobuoy location
 * @author Milkias Tadesse
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class LocationModule {

    private double x, y, z;

    /**
     * Constructor
     */
    public LocationModule() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    /**
     * Returns value of the x-axis value
     *
     * @return x: double value of x-axis
     */
    public double getX() {
        return 0;
    }

    /**
     * Returns value of the y-axis value
     *
     * @return y: double value of x-axis
     */
    public double getY() {
        return 0;
    }

    /**
     * Returns value of the z-axis value (depth)
     *
     * @return x: double value of z-axis
     */
    public double getZ() {
        return 0;
    }

    /**
     * Sets given value to be the current x-axis
     *
     * @param x: new x value
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Sets given value to be the current y-axis
     *
     * @param y: new y value
     */
    public void setY(double y) {
        this.y = y;

    }

    /**
     * Sets given value to be the current z-axis
     *
     * @param z: new z value
     */
    public void setZ(double z) {
        this.z = z;
    }
}
