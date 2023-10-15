package service;

import java.util.ArrayList;
import java.util.List;

import data.HotDrinks;

public class HotDrinksMachine implements VendingMachine
{
    HotDrinks DrinkProductCoffe = new HotDrinks("Coffe", 0.4, 89.99, 96);
    HotDrinks DrinkProductTea = new HotDrinks("Tea", 0.5, 34.99, 120);
    HotDrinks DrinkProductWatter = new HotDrinks("Watter", 0.9, 59.99, 0);
    
    private List<HotDrinks> hotDrinksList = new ArrayList<>(List.of(DrinkProductCoffe, DrinkProductTea, DrinkProductWatter));

    @Override
    public void getProduct (List<HotDrinks> newProduct)
    {
        this.hotDrinksList = newProduct;
        System.out.println(newProduct);
        
    }

    @Override
    public void SearchName(String name)
    {
        for (int i = 0; i < hotDrinksList.size(); i++) 
        {
            if(hotDrinksList.get(i).getName().equals(name))
            {
                System.out.println(hotDrinksList.get(i));    
            }
        }

    }

    @Override
    public void SearchVolume(Double volume)
    {
        for (int i = 0; i < hotDrinksList.size(); i++) 
        {
            if(hotDrinksList.get(i).getVolume().equals(volume))
            {
                System.out.println(hotDrinksList.get(i));    
            }
        }

    }

    @Override
    public void SearchTemperature(int temperature)
    {
        for (int i = 0; i < hotDrinksList.size(); i++) 
        {
            if(hotDrinksList.get(i).getTemperature() == (temperature))
            {
                System.out.println(hotDrinksList.get(i));    
            }
        }
        
    }
}
