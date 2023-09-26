// Work №1 - Task №1
// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

//     Создать наследника реализованного класса "Горячий Напиток" с дополнительным полем int температура.

package Task1;

public class Main 
{
    public static void main(String[] args)
    {
        HotDrinks hotDrinks = new HotDrinks();
        hotDrinks.setName("Cocoa");
        hotDrinks.setCost(9.99);

        HotDrinks tempDrinks = new TempDrinks();
        tempDrinks.setName("Hot Cocoa");
        tempDrinks.setCost(13.99);
        tempDrinks.setTemperature(99);
        
        // System.out.println(hotDrinks);

        hotDrinks.printInfo();
        tempDrinks.printInfo();
    }
}