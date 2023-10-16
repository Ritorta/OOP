// Путь упаковки файлов.
package view;
// Импорт готового метода.
import java.util.List;
// Импорт класса.
import data.User;
import data.StudentGroup;
import data.Student;
// Создаём типизированный UserView, наследующегося от типа User.
public interface UserView<T extends User> 
{
    // Установление полей для класса UserView.
    /**
     * @param sendOnConsole - .
     * @param sendOnConsoleUserGroup - .
     * @param sendOnConsoleListStudent - .
     */
    void sendOnConsole(List<StudentGroup<T>> groups);
    void sendOnConsoleUserGroup(StudentGroup<T> studentGroup);
    void sendOnConsoleListStudent(List<Student> students);
}
