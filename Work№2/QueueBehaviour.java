public interface QueueBehaviour 
{
    void takelnQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void ReleaseFromQueue();
    
}
