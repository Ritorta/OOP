package data;

import java.util.List;

import Old.OldStudent;
import Old.OldTeacher;

public class StudentGroup<T extends User>{
    private List<OldStudent> students;
    private OldTeacher teacher;

    public StudentGroup(OldTeacher teacher, List<OldStudent> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<OldStudent> getStudents() {
        return students;
    }

    public void setStudents(List<OldStudent> students) {
        this.students = students;
    }

    public OldTeacher getTeacher() {
        return teacher;
    }

    public void setTeacher(OldTeacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
               "students=" + students +
               ", teacher=" + teacher +
               '}';
    }

 
}
