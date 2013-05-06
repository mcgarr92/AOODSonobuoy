package main;

import config.ConfigurationData;
import factory.ActiveFactory;
import factory.PassiveFactory;
import factory.SpecialFactory;

/**
 * This class represents the main class used to start the Sonobuoy 
 * Deployment System
 * @author Kevin McGarry
 * Project 2 - Spring 2013 - AOOD - Rowan University
 */
public class main {

    public static void main(String[] args) {

        //NOTES:
        //Create an active sonobuoy using the factory
        //Deploy the sonobuoy with the following steps:
        //1. Activate sonobuoy (expand 
        //2. Drop the equipment to a specific depth
        //3. Emit sound into the water
        //4. Listen for return echos
        //5. Report the range/bearing of returns

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
    }
}