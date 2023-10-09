public abstract class Actor implements ActorBehaviuor
{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public void setName(String name) 
    {
        this.name = name;

    }

    public String getName() 
    {
        return name;

    }

    public void setMakeOrder(boolean isMakeOrder) 
    {
        this.isMakeOrder = isMakeOrder;
        
    }

    public boolean isMakeOrder() 
    {
        return isMakeOrder;

    }

    public void setTakeOrder(boolean isTakeOrder) 
    {
        this.isTakeOrder = isTakeOrder;
        
    }

     public boolean isTakeOrder() 
    {
        return isTakeOrder;

    }
}