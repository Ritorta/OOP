import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

    public class Stream implements Iterable<StudentGroup>
    {
       protected List<StudentGroup> group = new ArrayList<>();

        public void addGroup(StudentGroup groups)
        {
            group.add(groups);

        }

        @Override
        public Iterator<StudentGroup> iterator() 
        {
            return group.iterator();
            
        }

        public void printInfo()
        {
        for (StudentGroup group : group) 
            {
                System.out.println("- " + group.getNameGroup() + " (" + group.getNumberStudent() + " students)");
            }
            
        }
    }

 
    