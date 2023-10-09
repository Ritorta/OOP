// Work №3, Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable(Iterator);
// — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
// — *Модифицировать класс Контроллер, добавив в него созданный сервис
// — *Модифицировать класс Контроллер, добавив в него метод сортирующий
// список потоков, путем вызова созданного сервиса

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Stream stream1 = new Stream();
        
        stream1.addGroup(new StudentGroup("Group A", 30));
        stream1.addGroup(new StudentGroup("Group B", 75));
        stream1.addGroup(new StudentGroup("Group O", 55));
        stream1.addGroup(new StudentGroup("Group X", 65));
        stream1.addGroup(new StudentGroup("Group Z", 58));
        
        
        Stream stream2 = new Stream();
        
        stream2.addGroup(new StudentGroup("Group C", 35));
        stream2.addGroup(new StudentGroup("Group D", 28));
        stream2.addGroup(new StudentGroup("Group F", 95));
        stream2.addGroup(new StudentGroup("Group G", 5));

        List<Stream> allStreams = new ArrayList<>();
        allStreams.add(stream1);
        allStreams.add(stream2);

        StreamComparator compare = new StreamComparator();
        
        List<Stream> sort = StreamServes.sortStreams(allStreams, compare);
        
        for (Stream stream : sort) 
        {
            System.out.println("Stream with " + stream.group.size() + " groups:");
            
            stream.printInfo();
        }
    }
}
