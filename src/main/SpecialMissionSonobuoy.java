package main;

public class SpecialMissionSonobuoy extends Sonobuoy implements SonobuoyInterface 
{ 
    public SpecialMissionSonobuoy(String name, int state)
    {
       super (name + " Passive ", state);       
       updatePosition();
    }
    
    public int getData()
    {
        //TBD
        return 0;
    }
    
    public String nameOfBuoy()
    {
        return this.name;
    }
    
    public double getDepth()
    {
        return this.depth;
    }
    
    public void updateState(int newState)
    {
        this.state = newState;
    }
    public int getXPosition()
    {
       return this.x;
    }
    
    public int getYPosition()
    {
       return this.y;
    }

    public int getZPosition()
    {
        return this.z;
    }

    public double getAltitude()
    {
       return this.altitude;
    }

    public void updatePosition()
    {
       //determine the XYZ position of the sonobuoy
    }
}

