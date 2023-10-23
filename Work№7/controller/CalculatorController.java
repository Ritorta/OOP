package controller;

import data.Calculator;
import data.CalculatorComplexNumbers;
import view.CalculatorView;
import service.CalculatorLoger;
import service.CalculatorService;
// Контроллер
public class CalculatorController 
{
    private CalculatorView view;
    private Calculator calculator;
    private CalculatorService calculatorService;
    private CalculatorLoger loger;

    public CalculatorController(CalculatorView view, Calculator calculator, CalculatorService calculatorService, CalculatorLoger loger) 
    {
        this.view = view;
        this.calculator = calculator;
        this.calculatorService = calculatorService;
        this.loger = loger;
    }
    // Логика меню
    public void start()
    {
        
        boolean run = true;
        while(run)
        {
            view.consoleMenu();
            String choise = view.getInput();
            switch(choise)
            {
                case "1": AdditionOperation();
                break;
                case "2": SubtractionOperation();
                break;
                case "3": MultiplicationOperation();
                break;
                case "4": DivisionOperation();
                break;
                case "5": read();
                break;
                case "6": run = false;
                break;
                default:
                System.out.println("Choice number operation: ");
            }
        }      
    }
    // Метод вызова чтения из файла
    public void read() 
    {
        CalculatorLoger loger = new CalculatorLoger();
        String logContents = loger.read();
        System.out.println(logContents);

    }
    // Метод вызова операции сложения
    public void AdditionOperation()
    {
        System.out.println("First");
        CalculatorComplexNumbers num1 = calculatorService.getComplexNumber();
        System.out.println(num1);
        System.out.println("Second");
        CalculatorComplexNumbers num2 = calculatorService.getComplexNumber();
        System.out.println(num2);
        calculator.AdditionOperation(num1, num2);
        CalculatorComplexNumbers sum = calculator.AdditionOperation(num1, num2);
        String record = "Addition operation: " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        loger.write(record);

    }
    // Метод вызова операции разности
    public void SubtractionOperation()
    {
        System.out.println("First");
        CalculatorComplexNumbers num1 = calculatorService.getComplexNumber();
        System.out.println("Second");
        CalculatorComplexNumbers num2 = calculatorService.getComplexNumber();
        calculator.SubtractionOperation(num1, num2);
        CalculatorComplexNumbers sum = calculator.SubtractionOperation(num1, num2);
        String record = "Addition operation: " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        loger.write(record);

    }
    // Метод вызова операции умножения.
    public void MultiplicationOperation()
    {
        System.out.println("First");
        CalculatorComplexNumbers num1 = calculatorService.getComplexNumber();
        System.out.println("Second");
        CalculatorComplexNumbers num2 = calculatorService.getComplexNumber();
        calculator.MultiplicationOperation(num1, num2);
        CalculatorComplexNumbers sum = calculator.MultiplicationOperation(num1, num2);
        String record = "Addition operation: " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        loger.write(record);

    }
    // Метод вызова операции деления.
    public void DivisionOperation()
    {
        System.out.println("First");
        CalculatorComplexNumbers num1 = calculatorService.getComplexNumber();
        System.out.println("Second");
        CalculatorComplexNumbers num2 = calculatorService.getComplexNumber();
        calculator.DivisionOperation(num1, num2);
        CalculatorComplexNumbers sum = calculator.DivisionOperation(num1, num2);
        String record = "Addition operation: " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        loger.write(record);

    }
}
