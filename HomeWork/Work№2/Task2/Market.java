package Task2;

import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour
{
    List<Actor> buyer;
    Queue<Actor> buyerQueue;

    @Override
    public void acceptToMarket(Actor actor) 
    {
        System.out.println(actor.getName() + "Went to the Market");
        
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) 
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update() 
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ReleaseFromQueue() 
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void giveOrders() 
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void takeOrders() 
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void takelnQueue(Actor actor) 
    {
        // TODO Auto-generated method stub
        
    }
    
}
