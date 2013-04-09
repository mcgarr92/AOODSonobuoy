package main;

public class ActiveSonobuoy extends Sonobuoy implements SonobuoyInterface
{
    String name = "Default";
    double depth = 0.0;
    int state = 0;
    int x = 0;
    int y = 0;
    int z = 0;
    double altitude = 0.0;

    public ActiveSonobuoy(String name, int state)
    {
       //private fields here for active 
       this.name = name;
       this.state = state;
       updatePosition();
       
    }
    
    public int getData()
    {
        return 0;
    }
    
    public String nameOfBuoy()
    {
        return name;
    }
    
    public double getDepth()
    {
        return depth;
    }
    
    public void updateState(int newState)
    {
        this.state = newState;
    }
    public int getXPosition()
    {
       return x;
    }
    
    public int getYPosition()
    {
       return y;
    }

    public int getZPosition()
    {
        return z;
    }

    public double getAltitude()
    {
       return altitude;
    }

    public void updatePosition()
    {
       //determine the XYZ position of the sonobuoy
    }
}
