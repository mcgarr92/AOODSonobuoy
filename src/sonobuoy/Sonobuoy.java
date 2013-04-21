package sonobuoy;

import comms.Message;

public class Sonobuoy 
{
    int state = 0; //initial state    
    String name = " Sonobuoy";
    double depth = 0.0;
    int x = 0;
    int y = 0;
    int z = 0;
    double altitude = 0.0;
    
    public Sonobuoy(String name, int state)
    {
        this.name = name + this.name;
        this.state = state;
    }
    
    public int getCurrentState()
    {
        return this.state;
    }

    public void recieveMessage(Message m) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

