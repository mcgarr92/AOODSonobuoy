package controls;

/**
 *
 * Class responsible for translating and rotating sonobuoy as needed.
 */
public class MovementModule {

    private LocationModule location;

    /**
     * Constructor
     *
     * @param location: Location of Sonobuoy
     */
    public MovementModule(LocationModule location) {
        this.location = location;
    }

    /**
     * Moves the sonobuoy to the specified location
     *
     * @param x: x-axis and y-axis
     * @param y
     */
    public void move(double x, double y) {
        double degrees = Math.toDegrees(Math.atan(y / x));
        this.rotateZ_axis(degrees);
        location.setX(x);
        location.setY(y);
    }

    /**
     * Rotates Sonobuoy by th given degrees
     *
     * @param degrees: value in double
     */
    private void rotateZ_axis(double degrees) {
        System.out.println("Rotated: " + degrees + " degrees");
    }
}
