package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Old.OldStudent;
import Old.OldUser;

public class DataService {

    private List<OldUser> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<OldUser> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (OldUser user: this.users){
            if(user instanceof OldStudent){
                if (((OldStudent) user).getStudentId() > countMaxId){
                    countMaxId = ((OldStudent) user).getStudentId();
                }
            }
        }
        countMaxId++;

        OldStudent student = new OldStudent(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }
}
