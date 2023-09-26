package Task1;

public class HotDrinks 
{
    protected String name;
    protected Double cost;
    protected int temperature;

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public Double getCost() 
    {
        return cost;
    }

    public void setCost(Double cost) 
    {
        this.cost = cost;
    }

    public int getTemperature() 
    {
        return temperature;
    }


    public void setTemperature(int temperature) 
    {
        this.temperature = temperature;
    }

    @Override
    public String toString() 
    {
        return "Select drink: " + name + " - cost - " + cost + "$";
    }
    
    public void printInfo()
    {
        System.out.println("Select drink: " + name + " - cost - " + cost + "$");
    }
}
