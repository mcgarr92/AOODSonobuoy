/**
 * Kevin McGarry
 */

package sensors;

public class WaterTemperatureSensor {
    private float water_temp_in_celcius;
    private float water_temp_in_fahrenheit;
    
    public float getWaterTemperatureInCelcius() {
        return this.water_temp_in_celcius;
    }
    
    public float getWaterTemperatureInFahrenheit() {
        return this.water_temp_in_fahrenheit;
    }
}