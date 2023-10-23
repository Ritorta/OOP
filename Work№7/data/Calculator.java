package data;
// Интерфейс
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

    CalculatorComplexNumbers AdditionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2);
    CalculatorComplexNumbers SubtractionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2);
    CalculatorComplexNumbers MultiplicationOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2);
    CalculatorComplexNumbers DivisionOperation(CalculatorComplexNumbers num1, CalculatorComplexNumbers num2);
}
