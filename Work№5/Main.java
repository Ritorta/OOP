// Work №5, Урок 5. От простого к практике

// Взять проект из первого дз и сделать рефакторинг в паттерне MVC

// HomeWork №1:

//     Создать наследника реализованного класса "Горячий Напиток" с дополнительным полем int температура.
//     Создать класс "Горячих Напитков Автомат" реализующий интерфейс "Торговый Автомат" 
//     и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
//     выдающий продукт соответствующий имени, объёму и температуре
//     В main проинициализировать несколько "Горячих Напитков" и "Горячих Напитков Автомат" 
//     и воспроизвести логику, заложенную в программе

import data.Drinks;
import data.HotDrinks;

public class Main
{
    public static void main(String[] args)
    {
        Drinks drink = new HotDrinks("Cofe", 0.4, 4.99, 90);
        
        System.out.println(drink);
    }
}