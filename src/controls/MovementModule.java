package controls;


public class MovementModule {
	private SpeedModule currentSpeed;
	
	public MovementModule(SpeedModule currentSpeed){
		this.currentSpeed = currentSpeed;
	}
	
	public enum axis {
		x_axis, y_axis, z_axis
	}


	public void moveX_axis(SpeedModule speed) {
		this.currentSpeed = speed;
	}

	public void moveY_axis(SpeedModule speed) {
		this.currentSpeed = speed;
	}

	public void moveZ_axis(SpeedModule speed) {
		this.currentSpeed = speed;
	}


	public void rotateX_axis(int Degrees) {
	}

	public void rotateY_axis(int Degrees) {
	}

	public void rotateZ_axis(int Degrees) {

	}

	public void turn(MovementModule.axis axis_type, int Degrees, int seconds) {
		if (axis_type.equals(axis.x_axis)) {

		} else if (axis_type.equals(axis.y_axis)) {

		} else if (axis_type.equals(axis.z_axis)) {

		}
	}
}

