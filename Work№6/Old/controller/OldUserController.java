package Old.controller;

import view.UserView;

import java.time.LocalDate;
import java.util.List;

import Old.data.OldStudent;
import Old.data.OldTeacher;
import Old.data.OldUser;
import Old.service.OldDataService;
import Old.service.OldStudentGroupService;

public class OldUserController {

    private final OldDataService dataService = new OldDataService();
    private final OldStudentGroupService studentGroupService = new OldStudentGroupService();
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
