package data;

public interface Calculator
{
/** 
 * @param NumbersOperation - Метод создания комплексных чисел
 * @param AdditionOperation - Метод операции сложения
 * @param SubtractionOperation - Метод операции вычетания
 * @param MultiplicationOperation - Метод операции умножения
 * @param DivisionOperation - метод операции деления
 * @param num1 - Первое число метода NumbersOperation
 * @param num2 - Второе число метода NumbersOperation
 */

    void AdditionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2);
    void SubtractionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2);
    void MultiplicationOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2);
    void DivisionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2);
    void parseComplexNumber(String input);
   
}
