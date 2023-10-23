package view;

import java.util.Scanner;

import data.CalculatorComplexNumbers;
// Мето которое ещё не доделано Work progress...
public class CalculatorView
{
        public CalculatorView() {
        }
        // Метод для отображения меню и выбора операции
        public void consoleMenu() 
        {
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Read Logs");
            System.out.println("6. Выход");
        }
        // Метод для получения выбранной операции от пользователя
        public String getInput() 
        {
            System.out.print("Select: ");
            Scanner scanner = new Scanner(System.in);
           // int choice = scanner.nextInt();
           // Считываем символ новой строки после ввода числа
           return scanner.nextLine(); 
            //return choice;
        }
        public void displayResult(String result) 
        {
            System.out.println("Result: " + result);
        }
        
        public void displayResult(CalculatorComplexNumbers result) 
        {
            System.out.println("Result: " + result.toString());
        
        }
}    