package sonobuoy;

public interface SonobuoyInterface 
{
    public int getData();
    
    public String nameOfBuoy();
    
    public double getDepth();

    public int getXPosition();
    
    public int getYPosition();

    public int getZPosition();

    public double getAltitude();

    public void updateState(int newState);
}