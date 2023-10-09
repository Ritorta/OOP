import java.util.Comparator;

public class StreamComparator
{
    

    public int compareTo(Stream stream1, Stream stream2)
    {
        
        return Integer.compare(stream1.count(), stream2.count());
    }
    
}
