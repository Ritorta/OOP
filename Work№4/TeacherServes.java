public class TeacherServes 
{
    public boolean validateCheck(Teacher teacher)
    {
        if(teacher.getName() == null && teacher.getName().isEmpty())
        {
            return false;

        }

        if(teacher.getObject() == null && teacher.getObject().isEmpty())
        {
            return false;

        }

        return true;

    }
}
