import java.util.ArrayList;
import java.util.List;

public class TeacherController 
{
    private List<Teacher> teacherList = new ArrayList<>();
    private TeacherServes teacherServes;
    private TeacherView teacherView;

    public TeacherController(TeacherServes teacherServes, TeacherView teacherView) 
    {
        this.teacherServes = teacherServes;
        this.teacherView = teacherView;

    }

    public void addTeacher(String name, String object)
    {
        

        Teacher createteacher = new Teacher(name, object);
        int index = 0;
        index ++;

        if(teacherServes.validateCheck(createteacher))
        {
            teacherList.add(createteacher);
            
        }

        else
        {
            System.out.println("Error incorrect data teacher!");
        }

    }
    
    public void editTeacher(int index, String name, String object)
    {
        if(index >= 0 && index < teacherList.size())
        {
            Teacher curenTeacher = teacherList.get(index);
            curenTeacher.setName(name);
            curenTeacher.setObject(object);
        }

        else
        {
            System.out.println("Error: incorrect index teacher!");
        }

    }

    public void TeacherView()
    {
        teacherView.viewTeacherList(teacherList);

    }
}
