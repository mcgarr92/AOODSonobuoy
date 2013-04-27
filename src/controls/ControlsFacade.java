/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

/**
 *
 * @author milksmooth
 */
public interface ControlsFacade {

    void closeFrames();

    void generateSound();

    double[] getLocation();

    int getSpeed();

    boolean isFrameOpen();

    void maydayCommand();

    void move(int x, int y);

    void openFrames();

    void setSpeed(int speed);

    void stopSonobouy();
    
}
