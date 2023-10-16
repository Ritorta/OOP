package data;

public class HotDrinks extends Drinks
{
    private int temperature;

    public HotDrinks(String name, Double volume, Double cost, int temperature) 
    {
        super(name, volume, cost);
        this.temperature = temperature;

    }


    @Override
    public String toString() 
    {
        return "Selected drink: " + name + ", Volume: " + volume + ", Temperature - " + temperature + " C, Cost - " + cost + "$";

    }


    public int getTemperature() 
    {
        return temperature;
        
    }


    public void setTemperature(int temperature) 
    {
        this.temperature = temperature;

    }    
}
