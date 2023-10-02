package Task2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour
{
    public List<Actor> buyer = new ArrayList<>();
    public Queue<Actor> buyerQueue = new ArrayDeque<>();
        
    @Override
    public void acceptToMarket(Actor actor) 
    {
        buyer.add(actor);
        System.out.println(actor.getName() + " Went to the Market");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) 
    {
        
        System.out.println(actors.equals(actors) + " Get out from Market");
        buyer.remove(actors);
        
    }

    @Override
    public void update() 
    {
    
        
    }

    @Override
    public void ReleaseFromQueue() 
    {
        System.out.println(buyerQueue.peek().getName() + " Get out from queue");
        buyerQueue.poll();
    }

    @Override
    public void giveOrders() 
    {
        buyerQueue.peek().isMakeOrder();
        System.out.println(buyerQueue.peek().getName() + " Make order");
    }

    @Override
    public void takeOrders() 
    {
       buyerQueue.peek().isTakeOrder();
       System.out.println(buyerQueue.peek().getName() + " Take order"); 
    }

    @Override
    public void takelnQueue(Actor actor) 
    {
        buyerQueue.add(actor);
        System.out.println(actor.getName() + " Stay in queue");
    }

    //---------------------костыль------------------------
    // public void releaseFromMarket(Human name) 
    // {
    //     System.out.println(name.getName() + " Get out from Market");
    //     buyer.remove(name);
    // }
    
}
