package controls;

public class MovementModule {

    private LocationModule location;

    public MovementModule(LocationModule location) {
        this.location = location;
    }

    public void move(double x, double y) {
        double degrees = Math.toDegrees(Math.atan(y / x));
        this.rotateZ_axis(degrees);
        location.setX(x);
        location.setY(y);
    }

    private void rotateZ_axis(double degrees) {
        System.out.println("Rotated: " + degrees + " degrees");
    }
//    public void turn(MovementModule.axis axis_type, int Degrees, int seconds) {
//        if (axis_type.equals(axis.x_axis)) {
//        } else if (axis_type.equals(axis.y_axis)) {
//        } else if (axis_type.equals(axis.z_axis)) {
//        }
//    }
}
