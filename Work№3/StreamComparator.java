public class StreamComparator
{
    public int compare(Stream stream1, Stream stream2)
    {
        return Integer.compare(stream1.group.size(), stream2.group.size());

    }
}
