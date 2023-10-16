package controller;

import service.DataService;
import service.StudentGroupService;
import view.UserView;

import java.time.LocalDate;
import java.util.List;

import Old.OldStudent;
import Old.OldTeacher;
import Old.OldUser;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<OldUser> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(OldTeacher teacher, List<OldStudent> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public OldStudent getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<OldStudent> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<OldStudent> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }
}
