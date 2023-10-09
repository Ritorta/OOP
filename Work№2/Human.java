public class Human extends Actor
{
    @Override
    public void setMakeOrder() 
    {
        isMakeOrder = true;
        
    }

    @Override
    public void setTakeOrder() 
    {
        isTakeOrder = true;
        
    }

    @Override
    public String toString() 
    {
        return "Client name: " + name + "\nStatus: Make Order - " + isMakeOrder + 
        "\nStatus: Take Order - " + isTakeOrder;
    }
    
}
