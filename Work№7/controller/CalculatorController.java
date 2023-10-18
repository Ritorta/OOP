package controller;

import data.Calculator;
import data.CalculatorComplexNumbers;
import view.CalculatorView;

public class CalculatorController 
{
    private view.CalculatorView view;
    private data.Calculator calculator;
    private data.CalculatorComplexNumbers num1, num2;

    public CalculatorController(CalculatorView view, Calculator calculator, CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        this.view = view;
        this.calculator = calculator;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void AdditionOperation(Double add)
    {
        calculator.AdditionOperation(num1, num2);
    }
    
    public void SubtractionOperation(Double Sub)
    {
        calculator.SubtractionOperation(num1, num2);
    }

    public void MultiplicationOperation(Double Mul)
    {
        calculator.MultiplicationOperation(num1, num2);
    }

    public void DivisionOperation(Double Div)
    {
        calculator.DivisionOperation(num1, num2);
    }

    public void View()
    {
        
    }



}
