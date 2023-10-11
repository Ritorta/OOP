// import java.util.ArrayList;
// import java.util.List;

// public class HotDrinksMachine implements VendingMachine
// {
//     private List<HotDrinksMachine> producList = new ArrayList<>();

//     @Override
//     public void getProducts (List<HotDrinksMachine> newProduct)
//     {
//         this.producList = newProduct;
//         System.out.println(producList);

//     }

//     @Override
//     public void SearchName()
//     {
//         for (int i = 0; i < producList.size(); i++) 
//         {
//             if(producList.get(i).getName().equals(name))
//             {
//                 System.out.println(producList.get(i));    
//             }
//         }

//     }


//     @Override
//     public void SearchVolume()
//     {
//         for (int i = 0; i < producList.size(); i++) 
//         {
//             if(producList.get(i).getVolume().equals(volume))
//             {
//                 System.out.println(producList.get(i));    
//             }
//         }

//     }

//     @Override
//     public void SearchTemperature()
//     {
//         for (int i = 0; i < producList.size(); i++) 
//         {
//             if(producList.get(i).getTemperature() == (temperature))
//             {
//                 System.out.println(producList.get(i));    
//             }
//         }
//     }

// }
