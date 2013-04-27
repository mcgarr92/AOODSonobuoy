package sonobuoy;

public class PassiveSonobuoy extends Sonobuoy implements SonobuoyInterface 
{ 
    //Passive Sonobuoy max depth
    private float max_depth = 25; //feet
    
    public PassiveSonobuoy(String name, int state)
    {
       super (name + " Passive ", state);       
       updatePosition();
    }
    
    @Override
    public boolean deploy()
    {
        //1. Sonobuoy will land in the water
        //2. Drop the equipment to a specific depth (check current depth)
        //3. Activate sonobuoy (expand/unfold)
        //4. Standby for any received messages
        return this.deployed; //indicate if the sonobuoy has been deployed
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
    
    public void updateState(int newState)
    {
        //initial state = 0
        //deploying state = 1
        //deployed state = 2
        this.state = newState;
    }

}
