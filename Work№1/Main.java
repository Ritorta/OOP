// Work №1, Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

//     Создать наследника реализованного класса "Горячий Напиток" с дополнительным полем int температура.
//     Создать класс "Горячих Напитков Автомат" реализующий интерфейс "Торговый Автомат" и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//     выдающий продукт соответствующий имени, объёму и температуре
//     В main проинициализировать несколько "Горячих Напитков" и "Горячих Напитков Автомат" и воспроизвести логику, заложенную в программе

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args)   
    { 
        TempDrinks DrinkProductCoffe = new TempDrinks("Coffe", 0.4, 89.99, 96);
        TempDrinks DrinkProductTea = new TempDrinks("Tea", 0.5, 34.99, 120);
        TempDrinks DrinkProductWatter = new TempDrinks("Watter", 0.9, 59.99, 0);
        
        List<TempDrinks> addProduct = new ArrayList<>(List.of(DrinkProductCoffe, DrinkProductTea, DrinkProductWatter));
        
        // System.out.println(addProduct);
        
        HotDrinksMachine vendingproduct = new HotDrinksMachine(addProduct);
        vendingproduct.getProducts(addProduct);
        System.out.println();
        vendingproduct.SearchName("Coffe");
        vendingproduct.SearchVolume(0.9);
        vendingproduct.SearchTemperature(120);
        System.out.println();
        HotDrinks hotDrinks = new HotDrinks(null, null, null);
        hotDrinks.setName("Cocola");
        hotDrinks.setVolume(0.5);
        hotDrinks.setCost(9.99);
        System.out.println(hotDrinks);
        System.out.println();
        TempDrinks tempDrinks = new TempDrinks(null, null, null, 0);
        tempDrinks.setName("Hot Tea");
        tempDrinks.setVolume(0.8);
        tempDrinks.setCost(13.99);
        tempDrinks.setTemperature(99);
        System.out.println(tempDrinks);
        
        // hotDrinks.printInfo();
        // tempDrinks.printInfo();

    }
}
