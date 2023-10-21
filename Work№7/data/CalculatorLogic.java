package data;

public class CalculatorLogic implements Calculator
{
    // Метод реализации логики сложения комплексных чисел.
    @Override
    public CalculatorComplexNumbers AdditionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        // (a + bi) + (c + di) = (a + c) + (b + d)i
        double ValidSum = num1.getNumberValid() + num2.getNumberValid();
        double ImaginarySum = num1.getNumberImaginary() + num2.getNumberImaginary();
        //System.out.println("Sum complex numbers : " + ValidSum + " + " + ImaginarySum + "i");
        return new CalculatorComplexNumbers(ValidSum, ImaginarySum);

    }
    // Метод реализации логики вычитания комплексных чисел.
    @Override
    public CalculatorComplexNumbers SubtractionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        // (a + bi) - (c + di) = (a - c) + (b - d)i
        double ValidDeff = num1.getNumberValid() - num2.getNumberValid();
        double ImaginaryDeff = num1.getNumberImaginary() - num2.getNumberImaginary();
        // System.out.println("Subtraction complex numbers : " + ValidDeff + " - " + ImaginaryDeff);
        return new CalculatorComplexNumbers(ValidDeff, ImaginaryDeff);
        
    }
    // Метод реализации логики умножения комплексных чисел.
    @Override
    public CalculatorComplexNumbers MultiplicationOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        double ValidMul = num1.getNumberValid() * num2.getNumberValid() - num1.getNumberImaginary() * num2.getNumberImaginary();
        double ImaginaryMul = num1.getNumberValid() * num2.getNumberImaginary() + num1.getNumberImaginary() * num2.getNumberValid();
        // System.out.println("Multiplication complex numbers : " + ValidMul + " + " + ImaginaryMul);
        return new CalculatorComplexNumbers(ValidMul, ImaginaryMul);
        
    }
    // Метод реализации логики деления комплексных чисел.
    @Override
    public CalculatorComplexNumbers DivisionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2) 
    {
        double denominator = num2.getNumberValid() * num2.getNumberValid() + num2.getNumberImaginary() * num2.getNumberImaginary();
        if(denominator == 0)
        {
            throw new ArithmeticException("Error: Division by zero, impossible! Please enter the second number again.");
        }
        // (a + bi) / (c + di) = [(ac + bd) / (c^2 + d^2)] + [(bc - ad) / (c^2 + d^2)]i
        double ValidDev = (num1.getNumberValid() * num2.getNumberValid() + num1.getNumberImaginary() * num2.getNumberImaginary()) / denominator;
        double ImaginaryDev = (num1.getNumberImaginary() * num2.getNumberValid() - num1.getNumberValid() * num2.getNumberImaginary()) / denominator;
        // System.out.println("Division complex numbers : " + ValidDev + " + " + ImaginaryDev);
        return new CalculatorComplexNumbers(ValidDev, ImaginaryDev);

    }

    // public CalculatorComplexNumbers parseComplexNumber(String input) 
    // {
    //     // Разбор строки вида "a+bi" и создание объекта ComplexNumber
    //     String[] parts = input.split("[+-]");
    //     double ValidSum = Double.parseDouble(parts[0]);
    //     double ImaginarySum = Double.parseDouble(parts[1].replaceAll("[iI]", ""));
    //     return new CalculatorComplexNumbers(ValidSum, ImaginarySum);
    //   // System.out.println("Sum complex numbers : " + ValidSum + " . " + ImaginarySum + "i");
    // }

    // public double parseRealPart(String input) 
    // {
    //     String validPart = input.split("\\+")[0].trim();
    //     return Double.parseDouble(validPart);
    // }

    // public double parseRealPart(String input) 
    // {
    //     if (input.startsWith("-")) 
    //     {
    //         return Double.parseDouble(input.split("[+-]")[1].trim()) * -1;
    //     }
         
    //     else 
    //     {
    //         return Double.parseDouble(input.split("[+-]")[0].trim());
    //     }
    // }

    //  public double parseImaginaryPart(String input) 
    // {
    //     if (input.startsWith("-")) {
    //         if (input.matches("-[0-9.]*i")) 
    //         {
    //             return -1 * Double.parseDouble(input.split("[+-]")[2].replaceAll("i", "").trim());
    //         } 
    //         else 
    //         {
    //             return -1 * Double.parseDouble(input.split("[+-]")[2].replaceAll("i", "").trim());
    //         }

    //     } 
    //     else 
    //     {
    //         if (input.matches("-[0-9.]*i")) 
    //         {
    //             return -1 * Double.parseDouble(input.split("[+-]")[1].replaceAll("i", "").trim());
    //         } 
    //         else 
    //         {
    //             return Double.parseDouble(input.split("[+-]")[1].replaceAll("i", "").trim());
    //         }
    //     }
    // }

    public double parseRealPart (String input) 
    {
        if (input.startsWith("-") || input.startsWith("+")) 
        {
            return Double.parseDouble(input.split("[+-]")[1].trim()) * -1;
        } 
        
        else 
        {
            return Double.parseDouble(input.split("[+-]")[0].trim());
        }
    }

    public double parseImaginaryPart (String input) 
    {
        int index = input.startsWith("-") || input.startsWith("+") ? 2 : 1;
        String res = input.split("[+-]")[index].replaceAll("i", "").trim();
        System.out.println(input.matches("(.)-[0-9.]+i") ? Double.parseDouble(res) * (-1) : Double.parseDouble(res));
        return input.matches("(.)-[0-9.]+i") ? Double.parseDouble(res) * (-1) : Double.parseDouble(res);
    }
}