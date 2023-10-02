package Task1;

public abstract class Actor implements ActorBehaviuor
{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean istakeOrder;

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public Actor(boolean isMakeOrder) {
        this.isMakeOrder = isMakeOrder;
    }

    
    
}

