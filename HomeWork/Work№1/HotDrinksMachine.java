public class HotDrinksMachine 
{
    protected String name;
    protected Double volume;
    protected int temperature;
    protected Double cost;

    public String getName() 
    {

        return name;

    }

    public void setName(String name) 
    {

        this.name = name;

    }

    public Double getVolume() 
    {

        return volume;

    }
    
    public void setVolume(Double volume) 
    {

        this.volume = volume;

    }

    public int getTemperature() 
    {

        return temperature;

    }

    public void setTemperature(int temperature) 
    {

        this.temperature = temperature;

    }

    public Double getCost() 
    {

        return cost;

    }

    public void setCost(Double cost) 
    {

        this.cost = cost;
        
    }

    public HotDrinksMachine(String name, Double volume, int temperature, Double cost) 
    {

        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;

    }

    
    @Override
    public String toString() 
    {

       return ("\nHotDrinks - Select drink: " + name + ", Volume - " + volume + ", Temperature - " + temperature + ", Cost - "
                + cost + "$");

    }
    
}
