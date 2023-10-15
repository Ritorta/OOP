package service;

import java.util.ArrayList;
import java.util.List;

import data.HotDrinks;

public class HotDrinksMachine implements VendingMachine
{
    HotDrinks DrinkProductCoffe = new HotDrinks("Coffe", 0.4, 89.99, 96);
    HotDrinks DrinkProductTea = new HotDrinks("Tea", 0.5, 34.99, 100);
    HotDrinks DrinkProductWatter = new HotDrinks("Watter", 0.9, 59.99, 0);
    HotDrinks DrinkProductCocao = new HotDrinks("Cocao", 0.6, 55.00, 90);
    HotDrinks DrinkProductGreenTea = new HotDrinks("GreenTea", 0.5, 14.99, 120);
    HotDrinks DrinkProductMilkShake = new HotDrinks("MilkShake", 1.0, 49.23, 0);
    
    
    private List<HotDrinks> hotDrinksList = new ArrayList<>(List.of(DrinkProductCoffe, DrinkProductTea, DrinkProductWatter, 
    DrinkProductCocao, DrinkProductGreenTea, DrinkProductMilkShake));

    public List<HotDrinks> getProducts() 
    {
        return new ArrayList<>(hotDrinksList);
        
    }

    @Override
    public void setProducts(List<HotDrinks> newProduct) 
    {
        this.hotDrinksList = newProduct;
        
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
