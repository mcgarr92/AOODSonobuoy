package controls;

/**
 *
 * @author Kevin
 */
public class Controls {

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

    public void openFrames() {
        frameModule.openFrames();
    }

    public void closeFrames() {
        frameModule.closeFrames();

    }

    public boolean isFrameOpen() {
        return frameModule.isFrameOpen();
    }

    public double[] getLocation() {
        double location[] = {locationModule.getX(), locationModule.getY(),
            locationModule.getZ()};
        return location;
    }

    public void move(int x, int y) {
        movementModule.move(x, y);
    }

    public void generateSound() {
        soundModule.generateSound();

    }

    public void stopSonobouy() {
        scModule.stopSonobouy();

    }

    public void maydayCommand() {
        scModule.maydayCommand();
    }

    public void setSpeed(int speed) {
        speedModule.setSpeed(speed);
    }

    public int getSpeed() {
        return speedModule.getSpeed();
    }
}
