package data;

import java.util.ArrayList;
import java.util.List;

//Создание типизированого класса StudetnGroup.
public class StudentGroup<T extends User> 
{
    // Определение параметров.
    private String groupName;
    private List<T> students;

    // Создание конструктора.
    public StudentGroup(String groupName) 
    {
        this.groupName = groupName;
        this.students = new ArrayList<>();

    }

    // Определение Geters and Seters.
    public String getGroupName() 
    {
        return groupName;
    }



    public void setGroupName(String groupName) 
    {
        this.groupName = groupName;
    }



    public List<T> getStudents() 
    {
        return students;

    }



    public void setStudents(List<T> students) 
    {
        this.students = students;

    }

    public void addStudent(T student) 
    {
        students.add(student);

    }

    public void removeStudent(T student) 
    {
        students.remove(student);

    }
}
