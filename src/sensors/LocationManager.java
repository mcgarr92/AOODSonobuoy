/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors;

public class LocationManager {

    private int x = 0;
    private int y = 0;
    private int z = 0;
    private double lat;
    private double lon;
    private double altitude;

    public int getXPosition() {
        return this.x;
    }

    public int getYPosition() {
        return this.y;
    }

    public int getZPosition() {
        return this.z;
    }

    public double getLatitude() {
        return this.lat;
    }

    public double getLongitude() {
        return this.lon;
    }

    public double getAltitude() {
        return this.altitude;
    }

    private void updatePosition() {
        //determine the XYZ position of the sonobuoy
    }
}
