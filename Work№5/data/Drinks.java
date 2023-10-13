package data;

public abstract class Drinks
{
    protected String name;
    protected Double volume;
    protected Double cost;

    public Drinks(String name, Double volume, Double cost) 
    {
        this.name = name;
        this.volume = volume;
        this.cost = cost;

    }

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

    public Double getCost() 
    {
        return cost;

    }

    public void setCost(Double cost) 
    {
        this.cost = cost;

    }
}
