// Реализовать класс Market и все методы, которые он обязан реализовывать.
// Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
// MarketBehaviour - помещает и удаляет человека из очереди, 
// метод update - обновляет состояние магазина (принимает и отдаёт заказы).

package Task2;

import java.util.ArrayList;
import java.util.List;
public class Main 
{
    public static void main(String[] args) 
    {
        Human name = new Human();
        name.setName("Horse");

        name.setMakeOrder();
        name.setTakeOrder();
       
        List<Actor> addbuyers = new ArrayList<>();


        addbuyers.add(name);

        Market magazin = new Market();

        magazin.acceptToMarket(name); // зашёл
        magazin.takelnQueue(name); // встал в очередь
        magazin.giveOrders(); // сделал заказ
        magazin.takeOrders(); // получил заказ
        magazin.ReleaseFromQueue(); // покинул очередь
        magazin.releaseFromMarket(addbuyers); // покинул магаин
        magazin.update(); 


      
      //  System.out.println(name);
    } 
}