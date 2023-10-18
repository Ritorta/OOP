package service;

import java.util.Scanner;

public class CalculatorService 
{
    private Scanner scanner;

    // Конструктор класса CalculatorService инициализируется объект scanner с использованием System.in. Этот объект Scanner будет использоваться для чтения ввода с клавиатуры.
    public CalculatorService() 
    {
        scanner = new Scanner(System.in);
    }
 // Метод для получения комплексного числа
    public String getComplexNumber() 
    {
        // Просим пользователя ввести комплексное число
        System.out.print("Please, enter the complex number (Format: a + bi): ");
        // Считываем введённое число и удаляем лишние пробелы спомощью ".trim()"
        String number = scanner.nextLine().trim();
        // Цикл "While" перезапускает ввод до тех пор пока не будет введено коректное комплексное число.
        while (!isValidComplexNumber(number)) 
        {
            System.out.print("Enter the complex number: ");
            number = scanner.nextLine().trim();
        }
        // После получения коректного числа преобразуем в нижний регестр и возвращаем из метода.
        return number.toLowerCase();
    }
    // Метод для проверки формата ввода комплексных чисел принимает строку number и проверяет, является ли она корректным комплексным числом.
    private boolean isValidComplexNumber(String number) {
        // Выполняется проверка, используя регулярное выражение (number.matches(...)). Регулярное выражение проверяет, соответствует ли строка следующему шаблону:
        /*
            -?: Опциональный знак минуса.
            \\d+: Одна или более цифр.
            (\\.\\d+)?: Опциональная десятичная точка и одна или более цифр после точки.
            \\s*: Опциональные пробелы.
            [+-]: Один из символов "+" или "-" (операция сложения или вычитания).
            \\s*: Опциональные пробелы.
            \\d+: Одна или более цифр.
            (\\.\\d+)?: Опциональная десятичная точка и одна или более цифр после точки.
            [iI]: Один из символов "i" или "I" (для обозначения мнимой части).
         */
        if (number.matches("-?\\d+(\\.\\d+)?\\s*[+-]\\s*\\d+(\\.\\d+)?[iI]")) 
        {
            return true;
        }
        // В случае не соотвествия "boolean" принимает "false" и выводиться сообщения об ошибке.
        System.out.println("Error! Incorect format complex number.");
        return false;
    }
}
