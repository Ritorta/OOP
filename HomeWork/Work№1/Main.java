// Work №1
// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

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
        HotDrinksMachine DrinkProductCoffe = new HotDrinksMachine("Coffe", 0.4, 96, 89.99);
        HotDrinksMachine DrinkProductTea = new HotDrinksMachine("Tea", 0.5, 120, 34.99);
        HotDrinksMachine DrinkProductWatter = new HotDrinksMachine("Watter", 0.9, 0, 59.99);
        
        List<HotDrinksMachine> addProduct = new ArrayList<>(List.of(DrinkProductCoffe, DrinkProductTea, DrinkProductWatter));

        VendingMachine vendingproduct = new VendingMachine();
        vendingproduct.getProducts(addProduct);
        vendingproduct.SearchName("Coffe");
        vendingproduct.SearchVolume(0.9);
        vendingproduct.SearchTemperature(120);

        HotDrinks hotDrinks = new HotDrinks("Cocoa", 0.2, 100, 0.99);

        System.out.println(hotDrinks);
        
        hotDrinks.setName("Sugar-Cocoa");
        hotDrinks.setCost(1.00);

        
        hotDrinks.printInfo();
    }
}
