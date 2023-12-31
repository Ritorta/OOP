package controller;


import java.util.List;
import data.HotDrinks;
import service.VendingMachine;

public class ConrollerMachine
{
    private List<HotDrinks> hotDrinksList;
    private view.View view;
    private VendingMachine vendingMachine;

    public ConrollerMachine(view.View view, VendingMachine vendingMachine) 
    {
        this.view = view;
        this.vendingMachine = vendingMachine;
        this.hotDrinksList = vendingMachine.getProducts();
        
    }

    public void getProducts(List<HotDrinks> newProduct) 
    {
        this.hotDrinksList = newProduct;
        vendingMachine.setProducts(newProduct);
        System.out.println(newProduct);
        
    }

    public void SearchName(String name)
    {
        vendingMachine.SearchName(name);

    }

    public void SearchVolume(Double volume)
    {
        vendingMachine.SearchVolume(volume);

    }

    public void SearchTemperature(int temperature)
    {
        vendingMachine.SearchTemperature(temperature);

    }

    public void viewList() 
    {
        view.viewDrinksList(hotDrinksList);

    }   
}

