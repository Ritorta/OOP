// Путь упаковки файлов.
package view;
// Импорт готового метода.
import java.util.List;
import java.util.logging.Logger;
// Импорт класса.
import data.Student;
import data.StudentGroup;
import data.User;
// Создаём типизированный StudentView, который реализует UserView от типа User.
public class StudentView implements UserView<User> 
{

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<StudentGroup<User>> groups) {
        for(StudentGroup<User> group: groups) {
            for(User student: group.getStudents()) {
                logger.info(student.toString());
            }
        }
    }

    @Override
    public void sendOnConsoleUserGroup(StudentGroup<User> studentGroup) {
        logger.info(studentGroup.toString());
    }

    @Override
    public void sendOnConsoleListStudent(List<Student> students) {
        logger.info(students.toString());
    }

    
}
