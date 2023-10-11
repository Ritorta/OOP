import java.util.List;

public class TeacherView 
{
    public void viewTeacher(Teacher teacher)
    {
        System.out.println("Name Teacher: " + teacher.getName() + "Leads object: " + teacher.getObject());

    }

    public void viewTeacherList(List<Teacher> teachers)
    {
        for(Teacher teacher : teachers)
        {
            viewTeacher(teacher);
            System.out.println();
        }
    }
}
