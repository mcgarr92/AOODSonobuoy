package controls;

/**
 * Class responsible for commanding sonobuoy to open or close frames
 * @author Milkias Tadesse
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class FrameModule {

    private boolean framesOpen;

    /**
     * Constructor
     */
    public FrameModule() {
        framesOpen = false;
    }

    /**
     * Perform command to open frames
     */
    public void openFrames() {
        this.framesOpen = true;
    }

    /**
     * Perform command to close frames
     */
    public void closeFrames() {
        this.framesOpen = false;

    }

    /**
     * Method return whether or not frame is open
     *
     * @return boolean: true if open
     */
    public boolean isFrameOpen() {
        return this.framesOpen;
    }
}