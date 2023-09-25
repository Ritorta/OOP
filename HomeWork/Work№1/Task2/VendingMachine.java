package Task2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine 
{
    public List<HotDrinksMachine> producList = new ArrayList<>();

    public void getProducts (List<HotDrinksMachine> newProduct)
    {
        this.producList = newProduct;
        System.out.println(newProduct);
    }

    public void SearchName(String name)
    {
        for (int i = 0; i < producList.size(); i++) 
        {
            if(producList.get(i).getName().equals(name))
            {
                System.out.println(producList.get(i));    
            }
        }
    }

    public void SearchVolume(Double volume)
    {
        for (int i = 0; i < producList.size(); i++) 
        {
            if(producList.get(i).getVolume().equals(volume))
            {
                System.out.println(producList.get(i));    
            }
        }
    }

    public void SearchTemperature(int temperature)
    {
        for (int i = 0; i < producList.size(); i++) 
        {
            if(producList.get(i).getTemperature() == (temperature))
            {
                System.out.println(producList.get(i));    
            }
        }
    }
}



