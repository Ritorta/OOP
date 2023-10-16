package view;

import java.util.List;

import data.User;
import data.StudentGroup;
import data.Student;

public interface UserView<T extends User> 
{
    void sendOnConsole(List<StudentGroup<T>> groups);
    void sendOnConsoleUserGroup(StudentGroup<T> studentGroup);
    void sendOnConsoleListStudent(List<Student> students);
}
