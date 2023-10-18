package data;

public class CalculatorLogic implements Calculator
{
    //

    // Метод реализации логики сложения комплексных чисел.
    @Override
    public void AdditionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        double ValidSum = num1.getNumberValid() + num2.getNumberValid();
        double ImaginarySum = num1.getNumberImaginary() + num2.getNumberImaginary();
        System.out.println("Sum complex numbers : " + ValidSum + " + " + ImaginarySum);


    }
    // Метод реализации логики вычитания комплексных чисел.
    @Override
    public void SubtractionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        double ValidDeff = num1.getNumberValid() - num2.getNumberValid();
        double ImaginaryDeff = num1.getNumberImaginary() - num2.getNumberImaginary();
        System.out.println("Subtraction complex numbers : " + ValidDeff + " - " + ImaginaryDeff);

        
    }
    // Метод реализации логики умножения комплексных чисел.
    @Override
    public void MultiplicationOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        double ValidMul = num1.getNumberValid() * num2.getNumberValid() - num1.getNumberValid() * num2.getNumberValid();
        double ImaginaryMul = num1.getNumberValid() * num2.getNumberImaginary() + num1.getNumberImaginary() * num2.getNumberValid();
        System.out.println("Composition complex numbers : " + ValidMul + " + " + ImaginaryMul);

    }
    // Метод реализации логики деления комплексных чисел.
    @Override
    public void DivisionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        double denominator = num2.getNumberValid() * num2.getNumberValid() + num2.getNumberImaginary() * num2.getNumberImaginary();
        if(denominator == 0)
        {
            System.out.println("Error: Division by zero, impossible!");
            return;
        }
        double ValidDev = (num1.getNumberValid() * num2.getNumberValid() + num1.getNumberImaginary() * num2.getNumberImaginary()) / denominator;
        double ImaginaryDev = (num1.getNumberImaginary() * num2.getNumberValid() - num1.getNumberValid() * num2.getNumberImaginary()) / denominator;
        System.out.println("Division complex numbers : " + ValidDev + " + " + ImaginaryDev);

    }
}
