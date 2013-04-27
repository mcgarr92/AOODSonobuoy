package controls;

/**
 *
 * @author Kevin
 */
public class Controls implements ControlsFacade {

    private FrameModule frameModule;
    private LocationModule locationModule;
    private MovementModule movementModule;
    private SoundModule soundModule;
    private SpecialCommandModule scModule;
    private SpeedModule speedModule;

    public Controls() {
        frameModule = new FrameModule();
        speedModule = new SpeedModule();
        locationModule = new LocationModule();
        movementModule = new MovementModule(locationModule);
        soundModule = new SoundModule();
        scModule = new SpecialCommandModule();
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
        scModule.stopSonobouy();

    }

    @Override
    public void maydayCommand() {
        scModule.maydayCommand();
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
