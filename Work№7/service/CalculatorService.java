package service;

import java.util.Scanner;

import data.CalculatorComplexNumbers;
import data.CalculatorLogic;
// Метод проверяющий вводимые данные и инициализирующий парсинг строк
public class CalculatorService 
{
    private CalculatorLogic logic;
    private Scanner scanner;

    public CalculatorService(CalculatorLogic logic) 
    {
        scanner = new Scanner(System.in);
         this.logic = logic;
    }
    // Метод запрос ввода комплексного числа, проверкой на валидность и Парсинг
    public CalculatorComplexNumbers  getComplexNumber() 
    {
        System.out.print("Please, enter the complex number (Format: a + bi): ");
        String number = scanner.nextLine().trim();

        while (!isValidComplexNumber(number)) 
        {
            System.out.print("Enter the complex number: ");
            number = scanner.nextLine().trim();
        }
        // Парсим полученые значения
        double numberValid = logic.parseRealPart(number);
        double numberImaginary = logic.parseImaginaryPart(number);
        return new CalculatorComplexNumbers(numberValid, numberImaginary);

    }
    // Проверка на валидность комплексного числа.
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
