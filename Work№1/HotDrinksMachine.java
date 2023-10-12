import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine
{
    protected List<HotDrinks> addproduct = new ArrayList<>();

    @Override
    public void addProducts (List<HotDrinks> newProduct)
    {
        this.addproduct = newProduct;
        System.out.println(addproduct);

    }

    @Override
    public void SearchName(String name)
    {
        for (int i = 0; i < addproduct.size(); i++) 
        {
            if(addproduct.get(i).getName().equals(name))
            {
                System.out.println(addproduct.get(i));    
            }
        }

    }

    @Override
    public void SearchVolume(Double volume)
    {
        for (int i = 0; i < addproduct.size(); i++) 
        {
            if(addproduct.get(i).getVolume().equals(volume))
            {
                System.out.println(addproduct.get(i));    
            }
        }

    }

    @Override
    public void SearchTemperature(int temperature)
    {
        for (int i = 0; i < addproduct.size(); i++) 
        {
            if(addproduct.get(i).getTemperature() == (temperature))
            {
                System.out.println(addproduct.get(i));    
            }
        }
    }

    public HotDrinksMachine(List<HotDrinks> addproduct)
    {
        this.addproduct = addproduct;
    }


   

  

   

   

    

    

    

}
