package service;

import java.util.List;
import data.HotDrinks;

public interface VendingMachine 
{
    List<HotDrinks> getProducts();
    void setProducts(List<HotDrinks> hotDrinksList);
    void SearchName(String name);
    void SearchVolume(Double volume);
    void SearchTemperature(int temperature);
}
