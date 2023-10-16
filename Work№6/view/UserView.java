package view;

import java.util.List;
import java.util.logging.Logger;

import Old.OldStudent;
import Old.OldStudentGroup;
import Old.OldUser;

public class UserView 
{

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<OldUser> userList)
    {
        for(OldUser user: userList){
            logger.info(user.toString());
        }

    }

    public void sendOnConsoleUserGroup(OldStudentGroup studentGroup)
    {
        logger.info(studentGroup.toString());

    }

    public void sendOnConsoleListStudent(List<OldStudent> students)
    {
        logger.info(students.toString());

    }
}