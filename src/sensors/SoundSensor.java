package sensors;

/**
 * Detects sounds
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class SoundSensor {
    private int sound_type;
    
    /*
     * Get the type of sound that was heard
     * @return int: sound_type
     */
    public int getSoundType() {
        return this.sound_type;
    }
}
