package service;

import java.util.Scanner;


public class CalculatorService 
{
    private Scanner scanner;

   
    public CalculatorService() 
    {
        scanner = new Scanner(System.in);
    }

    public String getComplexNumber() 
    {
        System.out.print("Please, enter the complex number (Format: a + bi): ");
        String number = scanner.nextLine().trim();
        while (!isValidComplexNumber(number)) 
        {
            System.out.print("Enter the complex number: ");
            number = scanner.nextLine().trim();
        }
        return number.toLowerCase();
    }
   
    public boolean isValidComplexNumber(String number) 
    {
        if (number.matches("-?\\d+(\\.\\d+)?\\s*[+-]\\s*\\d+(\\.\\d+)?[iI]")) 
        {
            return true;
        }
        System.out.println("Error! Incorect format complex number.");
        return false;
    }

    




   
    
}
