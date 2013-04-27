package sonobuoy;

public class ActiveSonobuoy extends Sonobuoy implements SonobuoyInterface
{
    //Active Sonobuoy max depth
    private float max_depth = 15; //feet
    
    public ActiveSonobuoy(String name, int state)
    {
       super (name + " Active ", state);
       updatePosition();      
    }
    
    @Override
    public boolean deploy()
    {
        //1. Sonobuoy will land in the water
        //2. Drop the equipment to a specific depth (check current depth)
        //3. Activate sonobuoy (expand/unfold)
        //4. Emit sound into the water
        //5. Listen for return echos
        //6. Report the range/bearing of returns through the send message
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
