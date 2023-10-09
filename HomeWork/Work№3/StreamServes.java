import java.util.Comparator;
import java.util.List;

public class StreamServes 
{
    
    public void sortStream(List<Stream> streams)
    {
        streams.sort(new StreamComparator());
    }
}
