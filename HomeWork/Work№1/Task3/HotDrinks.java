package Task3;

public class HotDrinks extends DrinksMachine
{

    public HotDrinks(String name, Double volume, int temperature, Double cost) 
    {
        
        super(name, volume, temperature, cost);
  
    }

    @Override
    public String toString() 
    {
        
        return  super.toString();
       
        
    }
    
    public void printInfo()
    {
        System.out.println("Select drink: " + name + " - cost - " + cost + "$");
    }
    
}
