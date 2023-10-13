package service;

import java.util.List;
import data.HotDrinks;

public interface VendingMachine 
{
    void addProductsHot(List<HotDrinks> newProductHot);
    void SearchName(String name);
    void SearchVolume(Double volume);
    void SearchTemperature(int temperature);

}