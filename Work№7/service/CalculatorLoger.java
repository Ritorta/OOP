package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
// Модуль логов/записи в файл и чтения логов/записи в файл
public class CalculatorLoger 
{    
    //Создание переменной и файла для чтения и записи
    File file = new File("CalculatorLogs.txt");
    FileWriter writer;
    BufferedReader reader;

    public void write(String record) 
    {
        // Внутри метода происходит попытка записать значение "record" в файл "CalculatorLogs.txt" 
        try 
        {
            if (file.exists()) 
            {
                // Если файл уже существует, то открывается в режиме дозаписи 
                this.writer = new FileWriter(file, true);
            }
            // Иначе - создается новый файл.
            else this.writer = new FileWriter(file);
            // Создаём текущию дату.
            Date curentDate = new Date();
            // Устанавливаем формат даты
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            // Преобразум формат в String
            String dataTime = format.format(curentDate);
            // Добавляем дату в запись
            String addDate = dataTime + " - " + record;
            // Затем записывается значение "record" и закрывается FileWriter
            writer.write(addDate + '\n');
            writer.close();
        }

        catch (IOException e) 
        {
            throw new RuntimeException(e);
        }
        
    }
    // Создание метода "read", который считывает содержимое файла "CalculatorLogs.txt" и возвращает его в виде строки  
    public String read() 
    {
        String result = "";
        // Создается объект BufferedReader с файлом "CalculatorLogs.txt" для чтения данных
        try 
        {
            this.reader = new BufferedReader(new FileReader(file));

            while (true) 
            {
                String temp = reader.readLine();
                // Если достигнут конец файла (temp == null), то цикл прерывается
                if (temp == null) break;
                // В остальных случаях строка "temp" добавляется к переменной "result" с добавлением символа новой строки
                result += temp + "\n";
            }

            reader.close();
        } 

        catch (IOException e) 
        {
            throw new RuntimeException(e);
        }
        // В конце метода возвращается содержимое файла в виде строки.
        return result;
    }
}
