package main;

import config.ConfigurationData;
import factory.ActiveFactory;
import factory.PassiveFactory;
import factory.SpecialFactory;

/**
 *
 * @author Kevin
 */
public class main {

    public static void main(String[] args) {
        ConfigurationData config = new ConfigurationData();
        Sonobuoy sonobuoy = null;
        switch (config.getSonobuoyType()) {
            case 0:
                sonobuoy = new Sonobuoy(new ActiveFactory(), "Active Sonobuoy");
                break;
            case 1:
                sonobuoy = new Sonobuoy(new PassiveFactory(), "Passive Sonobuoy");
                break;
            case 2:
                sonobuoy = new Sonobuoy(new SpecialFactory(), "Special Sonobuoy");
                break;
            default:
                break;
        }

        if (sonobuoy != null) {
            sonobuoy.run();
        }

        //Create an active sonobuoy using the factory

        //Deploy the sonobuoy

        //1. Activate sonobuoy (expand 
        //2. Drop the equipment to a specific depth
        //3. Emit sound into the water
        //4. Listen for return echos
        //5. Report the range/bearing of returns
    }
}