package sensors;

/**
 *
 * @author Kevin
 */
public class VolcanoSensor {
    private boolean volcano_detected;
    private boolean valcano_active;
    
    public boolean volcanoDetected() {
        return this.volcano_detected;
    }
    
    public boolean volcanoActive(int id) {
        return this.valcano_active;
    }
}
