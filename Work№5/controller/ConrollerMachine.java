package controller;


import java.util.ArrayList;
import java.util.List;
import data.HotDrinks;
import service.HotDrinksMachine;

public class ConrollerMachine
{
    private List<HotDrinks> hotDrinksList = new ArrayList<>();
    private view.View view;
    private HotDrinksMachine hotDrinksMachine;
    
    public ConrollerMachine(view.View view, HotDrinksMachine hotDrinksMachine) 
    {
        this.view = view;
        this.hotDrinksMachine = hotDrinksMachine;
    }

    public void getProduct (List<HotDrinks> newProduct)
    {
        this.hotDrinksList = newProduct;
        System.out.println(hotDrinksList);

    }

    public void View() 
    {
        view.viewDrinksList(hotDrinksList);

    }

}

