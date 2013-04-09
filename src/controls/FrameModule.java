
package controls;

public class FrameModule {
	private boolean framesOpen;

	public FrameModule() {
		framesOpen = false;
	}

	public void openFrames() {
		this.framesOpen = true;
	}

	public void closeFrames() {
		this.framesOpen = false;

	}

	public boolean isFrameOpen() {
		return this.framesOpen;
	}
}