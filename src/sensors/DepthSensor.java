package sensors;

/**
 * Monitors depth of sonobuoy
 */
public class DepthSensor {

	private float depth;

	/**
	 * Returns current depth of sonobuoy. Currently configured for
	 * simulation
	 *
	 * @return depth
	 */
	public float getDepth() {
		this.depth++;
		return this.depth;
	}
}
