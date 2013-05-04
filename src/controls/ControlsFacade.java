/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

/**
 *
 * Interface used for performing control commands for sonobuoy
 */
public interface ControlsFacade {

    /**
     * Sends a command to execute the closing of frame
     */
    void closeFrames();

    /**
     * Generate sound
     */
    void generateSound();

    /**
     * Return a location value which is an array [x,y]
     *
     * @return array[x-axis, y-axis]
     */
    double[] getLocation();

    /**
     * Returns current speed
     *
     * @return int: speed
     */
    int getSpeed();

    /**
     * Method return whether or not frame is open
     *
     * @return boolean: true if open
     */
    boolean isFrameOpen();

    /**
     * Emergency mode to save the Sonobuoy's life.
     */
    void maydayCommand();

    /**
     * Moves the sonobuoy to the specified location
     *
     * @param x: x-axis and y-axis
     * @param y
     */
    void move(int x, int y);

    /**
     * Perform command to open frames
     */
    void openFrames();

    /**
     * Set given speed to be the current Sonouboy's speed
     *
     * @param speed: integer which is power of speed
     */
    void setSpeed(int speed);

    /**
     * Stops the sonobuoy; Use for emergency case.
     */
    void stopSonobouy();
}
