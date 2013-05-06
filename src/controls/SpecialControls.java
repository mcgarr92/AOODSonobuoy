package controls;

/**
 * Special control type Sonobuoy implements the contolFacade to allow to perform
 * the permitted functions
 * @author Milkias Tadesse
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class SpecialControls implements ControlsFacade {

	private FrameModule frameModule;
	private LocationModule locationModule;
	private MovementModule movementModule;
	private SpecialCommandModule scModule;
	private SpeedModule speedModule;

	/**
	 * COnstructor
	 */
	public SpecialControls() {
		frameModule = new FrameModule();
		speedModule = new SpeedModule();
		locationModule = new LocationModule();
		movementModule = new MovementModule(locationModule);
		scModule = new SpecialCommandModule();
	}

       /**
        * Perform command to open frames
        */
	@Override
	public void openFrames() {
		frameModule.openFrames();
	}

       /**
        * Sends a command to execute the closing of frame
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
        *
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
        *
        * @param x: x-axis and y-axis
        * @param y
        */
	@Override
	public void move(int x, int y) {
		movementModule.move(x, y);
	}

       /**
        * Generate sound
        */
	@Override
	public void generateSound() {
		// not implemented
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
        * Set given speed to be the current Sonouboy's speed
        *
        * @param speed: integer which is power of speed
        */
	@Override
	public void setSpeed(int speed) {
		speedModule.setSpeed(speed);
	}

       /**
        * Returns current speed
        *
        * @return int: speed
        */
	@Override
	public int getSpeed() {
		return speedModule.getSpeed();
	}

       /**
        * Unfolds the sonobuoy.
        */
	@Override
	public void unfold() {
		this.frameModule.openFrames();
	}
}
