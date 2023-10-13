package data;

public class HotDrinks extends Drinks
{
    private int temperature;

    public HotDrinks(String name, Double volume, Double cost, int temperature) 
    {
        super(name, volume, cost);
        this.temperature = temperature;

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
