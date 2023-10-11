public class HotDrinks 
{
    protected String name;
    protected Double volume;
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

    public Double getCost() 
    {
        return cost;
    }

    public void setCost(Double cost) 
    {
        this.cost = cost;
    }

    // public HotDrinks(String name, Double volume, Double cost) 
    // {
    //     this.name = name;
    //     this.volume = volume;
    //     this.cost = cost;
    // }

    @Override
    public String toString() 
    {
        return "Select drink: " + name + ", Volume: " + volume + ", Cost - " + cost + "$";
    }

    public void printInfo() 
    {
        System.out.println("HotDrinks - Select drink: " + name + ", Cost - " + cost + "$");
    }    
}

