package Old;

import java.util.List;

public class OldStudentGroup implements Iterable<OldStudent>{
    private List<OldStudent> students;
    private OldTeacher teacher;

    public OldStudentGroup(OldTeacher teacher, List<OldStudent> students) {
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

    @Override
    public OldStudentGroupIterator iterator() {
        return new OldStudentGroupIterator(this);
    }
}
