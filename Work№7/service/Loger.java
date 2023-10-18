package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Loger 
{    
    //Создание переменной и файла для чтения и записи.
    File file = new File("Logs.txt");
    FileWriter writer;
    BufferedReader reader;

    public Loger() 
    {
        
    }
    // Создание метода "write", который принимает строковый аргумент "record". 
    public void write(String record) 
    {
        // Внутри метода происходит попытка записать значение "record" в файл "Logs.txt". 
        try 
        {
            if (file.exists()) 
            {
                // Если файл уже существует, то открывается в режиме дозаписи.   
                this.writer = new FileWriter(file, true);
            }
            // Иначе - создается новый файл.
            else this.writer = new FileWriter(file);
            // Затем записывается значение "record" и закрывается FileWriter. 
            writer.write(record + '\n');
            writer.close();
        }
        // Если происходит ошибка ввода-вывода, то выбрасывается исключение RuntimeException. 
        catch (IOException e) 
        {
            throw new RuntimeException(e);
        }
    }
    //Создание метода "erase", который очищает содержимое файла "Logs.txt".  
    public void erase() 
    {
        // Создается новый объект Scanner для чтения файла.
        Scanner scan = new Scanner("Logs.txt");
        // Затем создается объект Formatter с файлом "Logs.txt", что позволяет записывать в него данные.
        Formatter form = null;
        try 
        {
            form = new Formatter("Logs.txt");
        } 
        // Если возникает ошибка FileNotFoundException, то выбрасывается исключение RuntimeException.   
        catch (FileNotFoundException e) 
        {
            throw new RuntimeException(e);
        }
        // В цикле while происходит чтение файла построчно и затем вызывается метод format() у объекта Formatter, 
        // который записывает пустую строку, что приводит к удалению соответствующей строки из файла. Затем закрывается Scanner. 
        while (scan.hasNext()) 
        {
            form.format("");
            scan.next();
        }
    }
    // Создание метода "read", который считывает содержимое файла "Logs.txt" и возвращает его в виде строки.   
    public String read() 
    {
        String result = "";
        // Создается объект BufferedReader с файлом "Logs.txt" для чтения данных.
        try 
        {
            this.reader = new BufferedReader(new FileReader(file));
            // В цикле "while" происходит чтение файла построчно с использованием метода readLine().
            while (true) 
            {
                String temp = reader.readLine();
                // Если достигнут конец файла (temp == null), то цикл прерывается.
                if (temp == null) break;
                // В остальных случаях строка "temp" добавляется к переменной "result" с добавлением символа новой строки.
                result += temp + "\n";
            }
            // Затем закрывается BufferedReader.
            reader.close();
        } 
        // Если возникает ошибка ввода-вывода, то выбрасывается исключение RuntimeException.
        catch (IOException e) 
        {
            throw new RuntimeException(e);
        }
        // В конце метода возвращается содержимое файла в виде строки.
        return result;
    }
}
