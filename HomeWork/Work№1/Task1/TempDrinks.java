package Task1;

public class TempDrinks extends HotDrinks 
{     
    @Override
    public void printInfo() 
    {
        System.out.println("Select drink Hot coffe, " + name + " Temperature = " + temperature + " C, Cost - " + cost + " $");
    }
}
