package service;

import java.util.Scanner;

import data.CalculatorComplexNumbers;
import data.CalculatorLogic;

public class CalculatorService 
{
    private CalculatorLogic logic;
    private Scanner scanner;

    public CalculatorService(CalculatorLogic logic) 
    {
        scanner = new Scanner(System.in);
         this.logic = logic;
    }

     public CalculatorComplexNumbers  getComplexNumber() 
    {
        System.out.print("Please, enter the complex number (Format: a + bi): ");
        String number = scanner.nextLine().trim();
        while (!isValidComplexNumber(number)) 
        {
            System.out.print("Enter the complex number: ");
            number = scanner.nextLine().trim();
        }
        double numberValid = logic.parseRealPart(number);
        double numberImaginary = logic.parseImaginaryPart(number);
        return new CalculatorComplexNumbers(numberValid, numberImaginary);

    }
   
    public boolean isValidComplexNumber(String number) 
    {
    // Ожидаемый формат комплексного числа: a+bi или a-bi, где a и b - числа с плавающей запятой
    String complexNumberPattern = "-?\\d+(\\.\\d+)?\\s*[+-]\\s*\\d+(\\.\\d+)?[iI]";
    
        if (number.matches(complexNumberPattern)) 
        {
            return true;
        } 
        
        else 
        {
            System.out.println("Error! Incorect format complex number.");
            return false;
        }

    }
}
