// Work №1 - Task №3
// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

//     В main проинициализировать несколько "Горячих Напитков" и "Горячих Напитков Автомат" и воспроизвести логику, заложенную в программе

package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args)   
    { 
        DrinksMachine DrinkProductCoffe = new DrinksMachine("Coffe", 0.4, 96, 89.99);
        DrinksMachine DrinkProductTea = new DrinksMachine("Tea", 0.5, 120, 34.99);
        DrinksMachine DrinkProductWatter = new DrinksMachine("Watter", 0.9, 0, 59.99);
        
        List<DrinksMachine> addProduct = new ArrayList<>(List.of(DrinkProductCoffe, DrinkProductTea, DrinkProductWatter));

        VendingMachine vendingproduct = new VendingMachine();
        vendingproduct.getProducts(addProduct);
        vendingproduct.SearchName("Coffe");
        vendingproduct.SearchVolume(0.9);
        vendingproduct.SearchTemperature(120);
    }
}
