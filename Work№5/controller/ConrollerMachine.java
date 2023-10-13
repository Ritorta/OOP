package controller;


import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

import data.HotDrinks;
import service.HotDrinksMachine;

public class ConrollerMachine
{
    private view.View view;
    private HotDrinksMachine hotDrinksMachine;
    
    public ConrollerMachine(view.View view, HotDrinksMachine hotDrinksMachine) 
    {
        this.view = view;
        this.hotDrinksMachine = hotDrinksMachine;
    }

    HotDrinks hotDrinks = new HotDrinks(null, null, null, 0);

    

  //  List<HotDrinks> addProduct = new ArrayList<>(List.of(DrinkProductCoffe, DrinkProductTea, DrinkProductWatter));

    



    public void addProductsHot(String name, Double volume, Double cost, int temperature)
    {
        hotDrinks.setName(name);
        hotDrinks.setVolume(volume);
        hotDrinks.setTemperature(temperature);
        hotDrinks.setCost(cost);
        
        
    }

}

