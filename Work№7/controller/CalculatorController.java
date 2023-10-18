package controller;

import data.Calculator;
import data.CalculatorComplexNumbers;
import data.CalculatorLogic;
import view.CalculatorView;
import service.CalculatorLoger;
import service.CalculatorService;

public class CalculatorController 
{
    private CalculatorView view;
    private Calculator calculator;
    private CalculatorComplexNumbers num1, num2;
    private CalculatorService calculatorService;
    private CalculatorLogic logic;
    private CalculatorLoger loger;
    

    


    public CalculatorController(CalculatorView view, Calculator calculator, 
    CalculatorComplexNumbers num1, CalculatorComplexNumbers num2, 
    CalculatorService calculatorService, CalculatorLogic logic, CalculatorLoger loger) 
    {
        this.view = view;
        this.calculator = calculator;
        this.num1 = num1;
        this.num2 = num2;
        this.calculatorService = calculatorService;
        this.logic = logic;
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
       // calculator.AdditionOperation(num1, num2);
        // String num1 = view.getInput();
        // String num2 = view.getInput();
        // if (calculatorService.isValidComplexNumber(num1) && calculatorService.isValidComplexNumber(num2)) {
        //     String result = calculatorService.addComplexNumbers(num1, num2);
        //     view.displayResult(result);
        // } else {
        //     System.out.println("Invalid complex numbers");
        // }
        System.out.println("First");
        String inputNum1 = view.getInput();
         System.out.println("Second");
        String inputNum2 = view.getInput();
        
        if (calculatorService.isValidComplexNumber(inputNum1) && calculatorService.isValidComplexNumber(inputNum2)) {
            // Разбор строковых представлений в экземпляры класса CalculatorComplexNumbers
            double num1Real = logic.parseRealPart(inputNum1);
            double num1Imaginary = logic.parseImaginaryPart(inputNum1);
            CalculatorComplexNumbers num1 = new CalculatorComplexNumbers(num1Real, num1Imaginary);
            
            double num2Real = logic.parseRealPart(inputNum2);
            double num2Imaginary = logic.parseImaginaryPart(inputNum2);
            CalculatorComplexNumbers num2 = new CalculatorComplexNumbers(num2Real, num2Imaginary);
            
            calculator.AdditionOperation(num1, num2);
            
            String record = "Addition operation: " + num1.toString() + " + " + num2.toString();
            loger.write(record);
        } 
        else 
        {
            System.out.println("Invalid complex numbers");
        }
   
    }
    


    public void SubtractionOperation()
    {
        calculator.SubtractionOperation(num1, num2);
    }

    public void MultiplicationOperation()
    {
        calculator.MultiplicationOperation(num1, num2);
    }

    public void DivisionOperation()
    {
        calculator.DivisionOperation(num1, num2);
    }
}
