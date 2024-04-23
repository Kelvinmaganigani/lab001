import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasicCalculatorTests {

    private BasicCalculator calc;

    @BeforeEach
    public void setUp() {
        calc = new BasicCalculator();
    }

    @Test
    public void testAddition() {
        assertEquals("Addition of two positives failed", 10.0, calc.add(7, 3), 0.001);
        assertEquals("Addition of two negatives failed", -10.0, calc.add(-7, -3), 0.001);
        assertEquals("Addition of a positive and a negative failed", 4.0, calc.add(7, -3), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals("Subtraction of two positives failed", 4.0, calc.subtract(7, 3), 0.001);
        assertEquals("Subtraction of two negatives failed", -4.0, calc.subtract(-7, -3), 0.001);
        assertEquals("Subtraction of a positive and a negative failed", 10.0, calc.subtract(7, -3), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals("Multiplication of two positives failed", 21.0, calc.multiply(7, 3), 0.001);
        assertEquals("Multiplication of two negatives failed", 21.0, calc.multiply(-7, -3), 0.001);
        assertEquals("Multiplication of a positive and a negative failed", -21.0, calc.multiply(7, -3), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals("Division of two positives failed", 2.333, calc.divide(7, 3), 0.001);
        assertEquals("Division of two negatives failed", 2.333, calc.divide(-7, -3), 0.001);
        assertEquals("Division of a positive and a negative failed", -2.333, calc.divide(7, -3), 0.001);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(7, 0),
                "Division by zero should throw an ArithmeticException");
    }

    @Test
    public void testLargeNumbers() {
        assertEquals("Addition of large numbers failed", 1000000007.0, calc.add(1000000000, 7), 0.001);
        assertEquals("Multiplication of large numbers failed", 3000000000.0, calc.multiply(1000000000, 3), 0.001);
    }

    @Test
    public void testPrecision() {
        assertEquals("Precision in division failed", 0.3333333, calc.divide(1, 3), 0.0000001);
    }

    @Test
    public void testZeroOperations() {
        assertEquals("Addition involving zero failed", 7.0, calc.add(7, 0), 0.001);
        assertEquals("Subtraction involving zero failed", 7.0, calc.subtract(7, 0), 0.001);
        assertEquals("Multiplication by zero failed", 0.0, calc.multiply(7, 0), 0.001);
    }
}
