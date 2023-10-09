public class TempDrinks extends HotDrinks 
{     
    public TempDrinks(String name, Double volume, int temperature, Double cost) 
    {
        super(name, volume, temperature, cost);
        
    }

    @Override
    public void printInfo() 
    {
        System.out.println("HotDrinks - Select drink: " + name + ", Temperature - " + temperature + " C, Cost - " + cost + "$");
        
    }
}
