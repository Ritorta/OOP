package view;

import java.util.Scanner;

import data.CalculatorLogic;
import service.CalculatorLoger;
import service.CalculatorService;

public class CalculatorView
{
    class View 
    {
        private CalculatorService calculatorService;
        private CalculatorLogic calculatorLogic;
        private CalculatorLoger calculatorLoger;

        // Конструктор класса
        public View() 
        {
            calculatorService = new CalculatorService();
        }

        // Метод для отображения меню и выбора операции
        public void showMenu() 
        {
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("0. Выход");
        }

        // Метод для получения выбранной операции от пользователя
        public int getOperationChoice() 
        {
            System.out.print("Выберите операцию (0-4): ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после ввода числа
            return choice;
        }
    }
}
