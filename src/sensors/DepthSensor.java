package sensors;

/**
 * Monitors depth of sonobuoy
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class DepthSensor {

	private float depth;

	/**
	 * Returns current depth of sonobuoy. Currently configured for
	 * simulation
	 * @return depth
	 */
	public float getDepth() {
		this.depth++;
		return this.depth;
	}
}
