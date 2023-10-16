package Old;

import java.util.Iterator;
import java.util.List;

public class OldStudentGroupIterator implements Iterator<OldStudent> {

    private int counter;
    private final List<OldStudent> students;

    public OldStudentGroupIterator(OldStudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public OldStudent next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
