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
        buyer.add(actor);
        System.out.println(actor.getName() + "Went to the Market");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) 
    {
        buyer.remove(actors);
        System.out.println(actors.getName() + "Get out from Market");
        
    }

    @Override
    public void update() 
    {
    
        
    }

    @Override
    public void ReleaseFromQueue() 
    {
        buyerQueue.poll();
        System.out.println(buyerQueue.peek().getName() + "Get out from queue");
    }

    @Override
    public void giveOrders() 
    {
        buyerQueue.peek().isMakeOrder();
        System.out.println(buyerQueue.peek().getName() + "Make order");
    }

    @Override
    public void takeOrders() 
    {
       buyerQueue.peek().isTakeOrder();
       System.out.println(buyerQueue.peek().getName() + "Take order"); 
    }

    @Override
    public void takelnQueue(Actor actor) 
    {
        buyerQueue.add(actor);
        System.out.println(actor.getName() + "Stay in queue");
    }
    
}
