package main;

public class SonobuoyFactory 
{
   public SonobuoyFactory()
   {
    
   }
   
   public Sonobuoy createSonobuoy(int type)
   {
       Sonobuoy sonobuoy;
   
       //Active Sonobuoy
       if (type == 0)
       {
          sonobuoy = new ActiveSonobuoy("Active", 0);   
       }
       //Passive Sonobuoy
       else if (type == 1)
       {
           sonobuoy = new PassiveSonobuoy("Passive", 0);
       }
       else
       {
            sonobuoy = new PassiveSonobuoy("Passive", 0);        
       }
       return sonobuoy;
   }
}
