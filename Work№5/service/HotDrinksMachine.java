package service;

import java.util.ArrayList;
import java.util.List;

import data.HotDrinks;

public class HotDrinksMachine implements VendingMachine
{
    private List<HotDrinks> hotDrinksList = new ArrayList<>();

    
    
    public HotDrinksMachine(List<HotDrinks> hotDrinksList) 
    {
        this.hotDrinksList = hotDrinksList;
        
    }

    @Override
    public void getProduct (List<HotDrinks> addProduct)
    {
        // HotDrinks DrinkProductCoffe = new HotDrinks("Coffe", 0.4, 89.99, 96);
        // HotDrinks DrinkProductTea = new HotDrinks("Tea", 0.5, 34.99, 120);
        // HotDrinks DrinkProductCocao = new HotDrinks("Cocao", 0.9, 59.99, 80);

        // addProduct.add(0, DrinkProductCoffe);
        // addProduct.add(1, DrinkProductTea);
        // addProduct.add(2, DrinkProductCocao);

        this.hotDrinksList = addProduct;
        System.out.println(hotDrinksList);

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
