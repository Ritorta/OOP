package data;

public class Student extends User
{
    private Long studentId;
    

    public Student(String firstName, String secondName, String patronymic, Long studentId) 
    {
        super(firstName, secondName, patronymic);
        this.studentId = studentId;
    }


    public Long getStudentId() {
        return studentId;
    }


    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + ", patronymic=" + patronymic + "studentId=" + studentId + "]";
    }

    

    
}

