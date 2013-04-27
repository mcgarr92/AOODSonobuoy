package sonobuoy;

import comms.Message;

public class Sonobuoy 
{
    //initial state = 0
    //deploying state = 1
    //deployed state = 2
    int state = 0;     
    String name = " Sonobuoy";
    double current_depth = 0.0;
    double altitude = 0.0;
    boolean deployed = false; //initial status
    
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

