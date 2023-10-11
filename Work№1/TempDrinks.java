public class TempDrinks extends HotDrinks
{
    protected int temperature;

    public int getTemperature() 
    {
        return temperature;
    }

    public void setTemperature(int temperature) 
    {
        this.temperature = temperature;
    }

    public TempDrinks(String name, Double volume, Double cost, int temperature) 
    {
        super(name, volume, cost);
        this.temperature = temperature;
    }
    
    @Override
    public String toString() {
        return "Select drink: " + name + ", Volume: " + volume + ", Temperature - " + temperature + " C, Cost - " + cost + "$";
    }
    
    public void printInfo() 
    {
        System.out.println("HotDrinks - Select drink: " + name + ", Temperature - " + temperature + " C, Cost - " + cost + "$");
    }

     
    
    
}
