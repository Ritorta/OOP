package service;

import java.util.List;
import data.HotDrinks;

public interface VendingMachine 
{
    void getProduct(List<HotDrinks> hotDrinksList);
    void SearchName(String name);
    void SearchVolume(Double volume);
    void SearchTemperature(int temperature);

}
