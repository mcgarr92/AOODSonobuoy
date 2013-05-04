package controls;

/**
 *
 * Active Sonobuoy implements the contolFacade to allow to 
 * perform the permitted functions
 */
public class ActiveControls implements ControlsFacade {

    private FrameModule frameModule;
    private LocationModule locationModule;
    private MovementModule movementModule;
    private SoundModule soundModule;
    private SpeedModule speedModule;

    /**
     * Constructor
     */
    public ActiveControls() {
        frameModule = new FrameModule();
        speedModule = new SpeedModule();
        locationModule = new LocationModule();
        movementModule = new MovementModule(locationModule);
        soundModule = new SoundModule();
    }

    @Override
    public void openFrames() {
        frameModule.openFrames();
    }

    @Override
    public void closeFrames() {
        frameModule.closeFrames();

    }

    @Override
    public boolean isFrameOpen() {
        return frameModule.isFrameOpen();
    }

    @Override
    public double[] getLocation() {
        double location[] = {locationModule.getX(), locationModule.getY(),
            locationModule.getZ()};
        return location;
    }

    @Override
    public void move(int x, int y) {
        movementModule.move(x, y);
    }

    @Override
    public void generateSound() {
        soundModule.generateSound();

    }

    @Override
    public void stopSonobouy() {
        // not implemented
    }

    @Override
    public void maydayCommand() {
        // not implemented
    }

    @Override
    public void setSpeed(int speed) {
        speedModule.setSpeed(speed);
    }

    @Override
    public int getSpeed() {
        return speedModule.getSpeed();
    }
}
