// Work №1 - Task №2
// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

//     Создать класс "Горячих Напитков Автомат" реализующий интерфейс "Торговый Автомат" и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//     выдающий продукт соответствующий имени, объёму и температуре

package Task2;

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

    }


}
