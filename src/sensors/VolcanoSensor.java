package sensors;

/**
 * Detects volcanos and determines if they are active
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class VolcanoSensor {
    private boolean volcano_detected;
    private boolean volcano_active;
    
    /*
     * Determine if the volcano was detected
     * @return boolean: volcano_detected
     */
    public boolean volcanoDetected() {
        return this.volcano_detected;
    }
    
    /*
     * Determine if the volcano is active
     * @return boolean: volcano_active
     */
    public boolean volcanoActive(int id) {
        return this.volcano_active;
    }
}
