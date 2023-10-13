// Work №5, Урок 5. От простого к практике

// Взять проект из первого дз и сделать рефакторинг в паттерне MVC

// HomeWork №1:

//     Создать наследника реализованного класса "Горячий Напиток" с дополнительным полем int температура.
//     Создать класс "Горячих Напитков Автомат" реализующий интерфейс "Торговый Автомат" 
//     и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//     выдающий продукт соответствующий имени, объёму и температуре
//     В main проинициализировать несколько "Горячих Напитков" и "Горячих Напитков Автомат" 
//     и воспроизвести логику, заложенную в программе

import java.util.ArrayList;
import java.util.List;

import controller.ConrollerMachine;
import data.Drinks;
import data.HotDrinks;
import service.HotDrinksMachine;
import view.View;

public class Main
{
    public static void main(String[] args)
    {
        HotDrinks DrinkProductCoffe = new HotDrinks("Coffe", 0.4, 89.99, 96);
        HotDrinks DrinkProductTea = new HotDrinks("Tea", 0.5, 34.99, 120);
        HotDrinks DrinkProductWatter = new HotDrinks("Watter", 0.9, 59.99, 0);

        List<HotDrinks> addProduct = new ArrayList<>(List.of(DrinkProductCoffe, DrinkProductTea, DrinkProductWatter));
    

        


        View view = new View();
        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();
        ConrollerMachine controller = new ConrollerMachine(view, hotDrinksMachine);
        controller.getProduct(addProduct);
        // controller.SearchName("Coffe");
        // controller.SearchVolume(0.9);
        // controller.SearchTemperature(120);
        // controller.View();

        // view.viewDrinksList(addProduct);

        
    }

    
}