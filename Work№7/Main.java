// Work №7: Урок 7. ООП Дизайн и Solid ч.2

// 1. Создать проект калькулятора комплексных чисел (достаточно сделать сложение, вычетание(разность), умножение и деление).
// 2. Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
// 3. Соблюдать принципы SOLID, паттерны проектирования.
// Примечание: Можно выбрать другой язык программирования, например C# или Python, если выбран язык, отличный от JAVA, 
// но тогда необходимо написать документ, каким образом можно запустить приложение (что необходимо установить, каким образом запускать и т.п.).

import controller.CalculatorController;
import data.Calculator;
import data.CalculatorComplexNumbers;
import data.CalculatorLogic;
import service.CalculatorLoger;
import service.CalculatorService;
import view.CalculatorView;

class Main
{
    public static void main(String[] args) 
    {
        CalculatorView view = new CalculatorView();
        Calculator calculator = new CalculatorLogic();
        CalculatorLogic logic = new CalculatorLogic();
        CalculatorService service = new CalculatorService(logic);
        CalculatorLoger loger = new CalculatorLoger();
        CalculatorComplexNumbers num1 = new CalculatorComplexNumbers(null, null);
        CalculatorComplexNumbers num2 = new CalculatorComplexNumbers(null, null);

        CalculatorController controller = new CalculatorController(view, calculator, num1, num2, service, loger);
        controller.start();
    }
}
