// Work №5, Урок 5. От простого к практике

// Взять проект из первого дз и сделать рефакторинг в паттерне MVC

// HomeWork №1:

//     Создать наследника реализованного класса "Горячий Напиток" с дополнительным полем int температура.
//     Создать класс "Горячих Напитков Автомат" реализующий интерфейс "Торговый Автомат" 
//     и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//     выдающий продукт соответствующий имени, объёму и температуре
//     В main проинициализировать несколько "Горячих Напитков" и "Горячих Напитков Автомат" 
//     и воспроизвести логику, заложенную в программе

import controller.ConrollerMachine;
import service.HotDrinksMachine;
import view.View;

public class Main
{
    public static void main(String[] args)
    {
        View view = new View();
        HotDrinksMachine Machine = new HotDrinksMachine();
        ConrollerMachine controller = new ConrollerMachine(view, Machine);
        controller.SearchName("Coffe");
        controller.SearchVolume(0.9);
        controller.SearchTemperature(120);
        controller.viewList();

    }  
}
