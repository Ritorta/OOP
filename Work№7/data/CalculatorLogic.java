package data;

public class CalculatorLogic implements Calculator
{
    //
    
    // Метод реализации логики сложения комплексных чисел.
    @Override
    public void AdditionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        // (a + bi) + (c + di) = (a + c) + (b + d)i
        double ValidSum = num1.getNumberValid() + num2.getNumberValid();
        double ImaginarySum = num1.getNumberImaginary() + num2.getNumberImaginary();
        System.out.println("Sum complex numbers : " + ValidSum + " + " + ImaginarySum + "i");


    }
    // Метод реализации логики вычитания комплексных чисел.
    @Override
    public void SubtractionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        // (a + bi) - (c + di) = (a - c) + (b - d)i
        double ValidDeff = num1.getNumberValid() - num2.getNumberValid();
        double ImaginaryDeff = num1.getNumberImaginary() - num2.getNumberImaginary();
        System.out.println("Subtraction complex numbers : " + ValidDeff + " - " + ImaginaryDeff);

        
    }
    // Метод реализации логики умножения комплексных чисел.
    @Override
    public void MultiplicationOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        double ValidMul = num1.getNumberValid() * num2.getNumberValid() - num1.getNumberImaginary() * num2.getNumberImaginary();
        double ImaginaryMul = num1.getNumberValid() * num2.getNumberImaginary() + num1.getNumberImaginary() * num2.getNumberValid();
        System.out.println("Multiplication complex numbers : " + ValidMul + " + " + ImaginaryMul);

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
        // (a + bi) / (c + di) = [(ac + bd) / (c^2 + d^2)] + [(bc - ad) / (c^2 + d^2)]i
        double ValidDev = (num1.getNumberValid() * num2.getNumberValid() + num1.getNumberImaginary() * num2.getNumberImaginary()) / denominator;
        double ImaginaryDev = (num1.getNumberImaginary() * num2.getNumberValid() - num1.getNumberValid() * num2.getNumberImaginary()) / denominator;
        System.out.println("Division complex numbers : " + ValidDev + " + " + ImaginaryDev);

    }
    public void parseComplexNumber(String input) 
    {
        // Разбор строки вида "a+bi" и создание объекта ComplexNumber
        String[] parts = input.split("[+-]");
        double ValidSum = Double.parseDouble(parts[0]);
        double ImaginarySum = Double.parseDouble(parts[1].replaceAll("[iI]", ""));
      //  return new CalculatorComplexNumbers(ValidSum, ImaginarySum);
      System.out.println("Sum complex numbers : " + ValidSum + " . " + ImaginarySum + "i");
    }
    public double parseRealPart(String input) 
    {
        String validPart = input.split("\\+")[0].trim();
        return Double.parseDouble(validPart);
    }

    public double parseImaginaryPart(String input) 
    {
        String imaginaryPart = input.split("\\+")[1].replace("i", "").trim();
        return Double.parseDouble(imaginaryPart);
    }
}
