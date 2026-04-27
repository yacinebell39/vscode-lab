import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testCalculateResult_basicCase() {
        // (2+3) / (2*3) = 5/6 ≈ 0.8333
        double result = calculator.calculateResult(2, 3);
        assertEquals(5.0 / 6.0, result, 0.0001);
    }

    @Test
    void testCalculateResult_anotherCase() {
        // (4+5) / (4*5) = 9/20 = 0.45
        double result = calculator.calculateResult(4, 5);
        assertEquals(9.0 / 20.0, result, 0.0001);
    }

    @Test
    void testCalculateResult_sameNumbers() {
        // (3+3) / (3*3) = 6/9 ≈ 0.6666
        double result = calculator.calculateResult(3, 3);
        assertEquals(6.0 / 9.0, result, 0.0001);
    }
}
