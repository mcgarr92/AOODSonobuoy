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
        Application application;
        switch(config.getSonobuoyType()) {
            case 0: application = new Application(new ActiveFactory());  break;
            case 1: application = new Application(new PassiveFactory()); break;
            case 2: application = new Application(new SpecialFactory()); break;
            default: break;
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