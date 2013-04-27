/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors;

public interface SensorManagerFacade {

    public double getDepth();

    public int getXPosition();

    public int getYPosition();

    public int getZPosition();
    
    public double getLatitude();

    public double getLongitude();

    public double getAltitude();
}
