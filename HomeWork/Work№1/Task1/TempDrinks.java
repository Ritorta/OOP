package Task1;

public class TempDrinks extends HotDrinks 
{     
    @Override
    public void printInfo() 
    {
        System.out.println("HotDrinks - Select drink: " + name + ", Temperature - " + temperature + " C, Cost - " + cost + "$");
    }
}
