package view;

import java.util.Scanner;

import controller.CalculatorController;
import data.CalculatorComplexNumbers;
import data.CalculatorLogic;
import service.CalculatorLoger;
import service.CalculatorService;

public class CalculatorView
{
        private CalculatorController calculatorController;
        
        // Конструктор класса
        public CalculatorView(CalculatorController calculatorController) 
        {
            this.calculatorController = calculatorController; 
    
        }

  
        public CalculatorView() {
        }


        // Метод для отображения меню и выбора операции
        public void consoleMenu() 
        {
            System.out.println("1. Sum");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Выход");
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
            System.out.println("Result: " + result.toString());  // Используем toString()
        
        }
    
}    