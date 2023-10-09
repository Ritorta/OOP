// Work №2, Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования

// Реализовать класс Market и все методы, которые он обязан реализовывать.
// Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
// MarketBehaviour - помещает и удаляет человека из очереди, 
// метод update - обновляет состояние магазина (принимает и отдаёт заказы).

import java.util.ArrayList;
import java.util.List;
public class Main 
{
    public static void main(String[] args) 
    {
        Human name = new Human();
        name.setName("Rita");

        List<Actor> addbuyers = new ArrayList<>();

        addbuyers.add(name);

        Market magazin = new Market();

        magazin.acceptToMarket(name); // Клиент зашёл
        magazin.takelnQueue(name); // Клиент встал в очередь
        magazin.giveOrders(); // Клиент сделал заказ
      //  name.setMakeOrder(); // Проверка на успешность
        magazin.takeOrders(); //Клиент получил заказ
      //  name.setTakeOrder(); // Проверка на успешность
        magazin.ReleaseFromQueue(); // Клиент покинул очередь
        magazin.releaseFromMarket(addbuyers); // Клиент покинул магаин
        magazin.update(); 
      //  System.out.println(name); // Строка с именем и проверкой.


      
        
    } 
}