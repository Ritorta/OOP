import java.util.List;
public interface VendingMachine 
{
    void addProducts(List<TempDrinks> newProduct);
    void SearchName(String name);
    void SearchVolume(Double volume);
    void SearchTemperature(int temperature);

}
