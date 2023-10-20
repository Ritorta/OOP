package data;

public class CalculatorComplexNumbers 
{
/** 
* @param numberValid - Действительное число
* @param numberImaginary - Мнимая единица
*/
    private Double numberValid;
    private Double numberImaginary;

    public CalculatorComplexNumbers(Double numberValid, Double numberImaginary) 
    {
        this.numberValid = numberValid;
        this.numberImaginary = numberImaginary;
        
    }

    public Double getNumberValid() 
    {
        return numberValid;

    }

    public Double getNumberImaginary() 
    {
        return numberImaginary;

    }

    @Override
    public String toString() 
    {
    return numberValid + " + " + numberImaginary + "i";
            
    }
}
