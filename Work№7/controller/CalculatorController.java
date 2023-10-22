package controller;

import data.Calculator;
import data.CalculatorComplexNumbers;
import view.CalculatorView;
import service.CalculatorLoger;
import service.CalculatorService;

public class CalculatorController 
{
    private CalculatorView view;
    private Calculator calculator;
    private CalculatorComplexNumbers num1, num2;
    private CalculatorService calculatorService;
    private CalculatorLoger loger;
    private int regcount;

    public CalculatorController(CalculatorView view, Calculator calculator, 
    CalculatorComplexNumbers num1, CalculatorComplexNumbers num2, 
    CalculatorService calculatorService, CalculatorLoger loger) 
    {
        this.view = view;
        this.calculator = calculator;
        this.num1 = num1;
        this.num2 = num2;
        this.calculatorService = calculatorService;
        this.loger = loger;
    }

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
                case "5": run = false;
                break;
                default:
                System.out.println("Choice number operation: ");
            }
        }
    }

    public void AdditionOperation()
    {
        System.out.println("First");
        CalculatorComplexNumbers num1 = calculatorService.getComplexNumber();
        System.out.println(num1);
        System.out.println("Second");
        CalculatorComplexNumbers num2 = calculatorService.getComplexNumber();
        System.out.println(num2);
        calculator.AdditionOperation(num1, num2);
        regcount++;
        CalculatorComplexNumbers sum = calculator.AdditionOperation(num1, num2);
        String record = "Addition operation: " + regcount + ". " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        // String result = String.format("%.1f + %.1fi", num1.getNumberValid(), num2.getNumberImaginary());
        loger.write(record);

    }
    
    public void SubtractionOperation()
    {
        System.out.println("First");
        CalculatorComplexNumbers num1 = calculatorService.getComplexNumber();
        System.out.println("Second");
        CalculatorComplexNumbers num2 = calculatorService.getComplexNumber();
        calculator.SubtractionOperation(num1, num2);
        CalculatorComplexNumbers sum = calculator.SubtractionOperation(num1, num2);
        regcount++;
        String record = "Addition operation: " + regcount + ". " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        // String result = String.format("%.1f + %.1fi", num1.getNumberValid(), num2.getNumberImaginary());
        loger.write(record);
    }

    public void MultiplicationOperation()
    {
        System.out.println("First");
        CalculatorComplexNumbers num1 = calculatorService.getComplexNumber();
        System.out.println("Second");
        CalculatorComplexNumbers num2 = calculatorService.getComplexNumber();
        calculator.MultiplicationOperation(num1, num2);
        CalculatorComplexNumbers sum = calculator.MultiplicationOperation(num1, num2);
        regcount++;
        String record = "Addition operation: " + regcount + ". " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        // String result = String.format("%.1f + %.1fi", num1.getNumberValid(), num2.getNumberImaginary());
        loger.write(record);
    }

    public void DivisionOperation()
    {
        System.out.println("First");
        CalculatorComplexNumbers num1 = calculatorService.getComplexNumber();
        System.out.println("Second");
        CalculatorComplexNumbers num2 = calculatorService.getComplexNumber();
        calculator.DivisionOperation(num1, num2);
        CalculatorComplexNumbers sum = calculator.DivisionOperation(num1, num2);
        regcount++;
        String record = "Addition operation: " + regcount + ". " + num1.toString() + " + " + num2.toString() + " = " + sum.toString();
        // String result = String.format("%.1f + %.1fi", num1.getNumberValid(), num2.getNumberImaginary());
        loger.write(record);
    }
}
