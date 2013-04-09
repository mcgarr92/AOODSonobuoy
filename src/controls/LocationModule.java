package controls;

public class LocationModule {
	private MovementModule moveModule;

	public LocationModule(MovementModule moveModule) {
		this.moveModule = moveModule;
	}

	public int[][][] getLocation() {
		return new int[0][0][0];
	}
}

