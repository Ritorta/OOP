import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

    public class Stream implements Iterator<StudentGroup>, Iterable<StudentGroup>
    
    {
       private List<StudentGroup> group = new ArrayList<>();
       private int currentIndex = 0;

        @Override
        public boolean hasNext() 
        {
            return currentIndex < group.size();

        }

        @Override
        public StudentGroup next() 
        {
            if(hasNext())
                {
                    return group.get(currentIndex++);
                }

            throw new IllegalArgumentException();
        }

        public void addGroup(StudentGroup groups)
        {
            group.add(groups);
        }

        @Override
        public Iterator<StudentGroup> iterator() 
        {
            return group.iterator();
            
        }

        

    }

