package controls;

/**
 *
 * @author milksmooth
 */
public class Controls implements ControlsFacade {

    private FrameModule frameModule;
    private LocationModule locationModule;
    private MovementModule movementModule;
    private SoundModule soundModule;
    private SpecialCommandModule scModule;
    private SpeedModule speedModule;


    /**
     *Constructor
     */
    public Controls() {
        frameModule = new FrameModule();
        speedModule = new SpeedModule();
        locationModule = new LocationModule();
        movementModule = new MovementModule(locationModule);
        soundModule = new SoundModule();
        scModule = new SpecialCommandModule();
    }

    /**
     * Perform a command to open frames.
     */
    @Override
    public void openFrames() {
        frameModule.openFrames();
    }

    /**
     * Perform a command to close frames.
     */
    @Override
    public void closeFrames() {
        frameModule.closeFrames();

    }

    /**
     * Method return whether or not frame is open
     *
     * @return boolean: true if open
     */
    @Override
    public boolean isFrameOpen() {
        return frameModule.isFrameOpen();
    }

    /**
     * Return a location value which is an array [x,y]
     * @return array[x-axis, y-axis]
     */
    @Override
    public double[] getLocation() {
        double location[] = {locationModule.getX(), locationModule.getY(),
            locationModule.getZ()};
        return location;
    }

    /**
     * Moves the sonobuoy to the specified location
     * @param x: x-axis and y-axis
     * @param y
     */
    @Override
    public void move(int x, int y) {
        movementModule.move(x, y);
    }

    /**
     * Generated sound 
     */
    @Override
    public void generateSound() {
        soundModule.generateSound();

    }

    /**
     * Stops the sonobuoy; Use for emergency case.
     */
    @Override
    public void stopSonobouy() {
        scModule.stopSonobouy();

    }

    /**
     * Emergency mode to save the Sonobuoy's life.
     */
    @Override
    public void maydayCommand() {
        scModule.maydayCommand();
    }

    /**
     * Set the given speed to the Sonobuoy's control system
     * @param speed: integer of power speed
     */
    @Override
    public void setSpeed(int speed) {
        speedModule.setSpeed(speed);
    }

    /**
     * Get the current speed
     * @return int: speed
     */
    @Override
    public int getSpeed() {
        return speedModule.getSpeed();
    }
}
