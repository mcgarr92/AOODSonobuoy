package controls;

/**
 *
 * Class handles speed commands
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
     *
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