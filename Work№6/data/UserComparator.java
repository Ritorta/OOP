package data;

import java.util.Comparator;

// Создаём типизированный Comparator, наследующегося от типа User.
class UserComparator<T extends User> implements Comparator<T> 
{
    @Override
    public int compare(T User1, T User2) 
    {
        int resultOfComparing = User1.getSecondName().compareTo(User2.getSecondName());
        if (resultOfComparing == 0) 
        {
            resultOfComparing = User1.getFirstName().compareTo(User2.getFirstName());
            if (resultOfComparing == 0) 
            {
                return User1.getPatronymic().compareTo(User2.getPatronymic());
            }
// Улучшаем код избавлясь от else.
        //     else 
        //     {
        //         return resultOfComparing;
        //     }
        // } 

        // else 
        // {
        //     return resultOfComparing;
        // }
        }
        return resultOfComparing;
    }
}