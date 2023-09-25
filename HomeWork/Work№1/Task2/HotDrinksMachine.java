package Task2;

public class HotDrinksMachine 
{
    private String name;
    private Double volume;
    private int temperature;
    private Double cost;

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

    public void setVolune(Double volume)
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
    public String toString() {
        return "HotDrinksMachine [name=" + name + ", volume=" + volume + ", temperature=" + temperature + ", cost="
                + cost + "]";
    }
 
}
 