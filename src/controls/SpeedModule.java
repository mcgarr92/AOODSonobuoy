package controls;

/**
 * Class handles speed commands
 * @author Milkias Tadesse
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class SpeedModule {
    private int speed;

    /**
     * Constructor
     */
    public SpeedModule() {
        speed = 0;
    }

    /**
     * Sets the speed of the sonobuoy
     * @param speed:int speed value
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Return the value of the current speed
     * @return int value of speed
     */
    public int getSpeed() {
        return this.speed;
    }
}