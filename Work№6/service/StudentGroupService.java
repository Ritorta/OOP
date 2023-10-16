package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Old.OldStudent;
import Old.OldStudentComparator;
import Old.OldStudentGroup;
import Old.OldTeacher;

public class StudentGroupService {
    private OldStudentGroup studentGroup;

    public void createStudentGroup(OldTeacher teacher, List<OldStudent> students) {
        this.studentGroup = new OldStudentGroup(teacher, students);
    }

    public OldStudentGroup getStudentGroup() {
        return studentGroup;
    }

    public OldStudent getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<OldStudent> iterator = studentGroup.iterator();
        List<OldStudent> result = new ArrayList<>();
        while (iterator.hasNext()){
            OldStudent student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
               && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }

    public List<OldStudent> getSortedStudentGroup(){
        List<OldStudent> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<OldStudent> getSortedByFIOStudentGroup(){
        List<OldStudent> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new OldStudentComparator());
        return students;
    }
}