package data;
// Создание класса User. 
public class User 
{
    // Установление полей для класса пользователь, все поля приватные поскольку нам не надо их изменять.
     /** 
     * @param firstName -  Имя пользователя
     * @param secondName - Фамилия пользователя
     * @param patronymic - Отчество пользователя
    */
    protected String firstName;
    protected String secondName;
    protected String patronymic;
    
    // Создание конструктора
    public User(String firstName, String secondName, String patronymic)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;

    }
    // Создание Geters and Seters.
    public String getFirstName() 
    {
        return firstName;

    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;

    }

    public String getSecondName() 
    {
        return secondName;

    }

    public void setSecondName(String secondName) 
    {
        this.secondName = secondName;

    }

    public String getPatronymic() 
    {
        return patronymic;

    }

    public void setPatronymic(String patronymic) 
    {
        this.patronymic = patronymic;

    }
    // Создание консольной строки toString для вывода.
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + ", patronymic=" + patronymic + "]";

    }
   
}