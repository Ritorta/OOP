import java.util.List;

public class StreamServes 
{
    public static List<Stream> sortStreams(List<Stream> allStreams, StreamComparator compare) 
    {
        allStreams.sort((stream1, stream2) -> compare.compare(stream1, stream2));
        return allStreams;

    }
}
