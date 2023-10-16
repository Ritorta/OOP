// Путь упаковки файлов.
package data;
// Импорт готового метода.
import java.util.Comparator;
// Создаём типизированный Comparator, наследующегося от типа User.
class UserComparator<T extends User> implements Comparator<T> 
{
    @Override
    public int compare(T User1, T User2) 
    {
        // Сравниваем Фамилию.
        int resultOfComparing = User1.getSecondName().compareTo(User2.getSecondName());
        // Если Фамилии одинаковые, делаем дополнительное сравнение по именам.
        if (resultOfComparing == 0) 
        {
            // Сравниваем имя.
            resultOfComparing = User1.getFirstName().compareTo(User2.getFirstName());
            // // Если Имена одинаковые, делаем дополнительное сравнение по Отчеству.
            if (resultOfComparing == 0) 
            {
                return User1.getPatronymic().compareTo(User2.getPatronymic());
            }
        // Встаром коде использовалось много else, улучшаем код избавлясь от else.
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
        // Возвращаем результат.
        return resultOfComparing;

    }
}