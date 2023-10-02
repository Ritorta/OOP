package Task2;

public abstract class Actor implements ActorBehaviuor
{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public boolean isMakeOrder() 
    {
        return isMakeOrder;
    }
    public void setMakeOrder(boolean isMakeOrder) 
    {
        this.isMakeOrder = isMakeOrder;
    }
    public boolean isTakeOrder() 
    {
        return isTakeOrder;
    }
    public void setTakeOrder(boolean isTakeOrder) 
    {
        this.isTakeOrder = isTakeOrder;
    }

    

    



  

    
    
}

