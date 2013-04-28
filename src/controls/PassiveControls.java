package controls;

public class PassiveControls implements ControlsFacade {

    private FrameModule frameModule;
    private LocationModule locationModule;
    private MovementModule movementModule;
    private SpeedModule speedModule;

    public PassiveControls() {
        frameModule = new FrameModule();
        speedModule = new SpeedModule();
        locationModule = new LocationModule();
        movementModule = new MovementModule(locationModule);
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
        // not implemented

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
