package sensors;

/**
 * Detects water temperature
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class WaterTemperatureSensor {
    private float water_temp_in_celcius;
    private float water_temp_in_fahrenheit;
    
    /*
     * Get the water temperature (celcius)
     * @return float: water_temp_in_celcius
     */
    public float getWaterTemperatureInCelcius() {
        return this.water_temp_in_celcius;
    }
    
    /*
     * Get the water temperature (farenheit)
     * @return float: water_temp_in_fahrenheit
     */
    public float getWaterTemperatureInFahrenheit() {
        return this.water_temp_in_fahrenheit;
    }
}