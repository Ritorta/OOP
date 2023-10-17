package service;

import java.io.FileWriter;
import java.io.IOException;

public class Loger 
{
    private FileWriter fileWriter;

    public void Logs(String fileName) throws IOException 
    {
        fileWriter = new FileWriter(fileName, true);
    }

    public void logOperation(String operation) 
    {
        System.out.println("Logging operation: " + operation);
        try {
            fileWriter.write(operation + "\n");
            fileWriter.flush();
        } catch (IOException e) 
        {
            System.out.println("Failed to write to log file: " + e.getMessage());
        }
    }

    public void close() 
    {
        try {
            fileWriter.close();
        } catch (IOException e) 
        {
            System.out.println("Failed to close log file: " + e.getMessage());
        }
    }
}
