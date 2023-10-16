package data;

import java.time.LocalDate;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class StudentExtended extends Student{
    public StudentExtended(String name) {
        super(name);

    }
}
