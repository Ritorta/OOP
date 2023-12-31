// Путь упаковки файлов.
package controller;
// Импорт готового метода.
import java.util.List;
// Импорт класса.
import data.StudentGroup;
import data.User;
// Создаём типизированный UserController, наследующегося от типа User.
public interface UserController<T extends User> 
{
    // Установление полей для класса UserController.
    /**
     * @param createGroup - Метод создания группы студентов.
     * @param addStudentToGroup - Метод добавления студента в группу.
     * @param removeStudentFromGroup - Метод удаления студента из группы.
     * @param getGroups - Метод возврата всех групп студентов.
     */
    void createGroup(String groupName);
    void addStudentToGroup(StudentGroup<T> group, T student);
    void removeStudentFromGroup(StudentGroup<T> group, T student);
    List<StudentGroup<T>> getGroups();
}
