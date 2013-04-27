package sonobuoy;

public class SpecialMissionSonobuoy extends Sonobuoy implements SonobuoyInterface 
{ 
    //Special Mission Sonobuoy max depth
    private float max_depth = 50; //feet
    
    public SpecialMissionSonobuoy(String name, int state)
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
        //4. Perform special mission as required
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

