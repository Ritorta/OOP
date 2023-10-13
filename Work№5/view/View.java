package view;

import java.util.List;

import data.HotDrinks;


public class View 
{
    public void viewDrinks(HotDrinks hotDrinks)
    {
       System.out.println("Selected drink: " + hotDrinks.getName() + ", Volume: " + hotDrinks.getVolume() + ", Temperature - " + hotDrinks.getTemperature() + " C, Cost - " + hotDrinks.getCost() + "$");

    }

    public void viewDrinksList(List<HotDrinks> drinksView)
    {
        for(HotDrinks drinks : drinksView)
        {
            viewDrinks(drinks);
            System.out.println();
        }
    }
}
