/**
 * Calculator class - AFTER Refactoring (Rename Variables/Methods)
 *
 * Before refactoring:
 *   - method was named: calc(double a, double b)
 *   - variables were named: x, y
 *   - print method was named: prtRes(double res)
 *
 * After refactoring:
 *   - method renamed to: calculateResult(double firstNumber, double secondNumber)
 *   - variables renamed to: sum, product
 *   - print method renamed to: printResult(double result)
 */
public class Calculator {

    public double calculateResult(double firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;
        double product = firstNumber * secondNumber;
        return sum / product;
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}
