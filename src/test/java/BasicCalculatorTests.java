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
        assertEquals(10.0, calc.add(7, 3), 0.001, "Addition of two positives failed");
        assertEquals(-10.0, calc.add(-7, -3), 0.001, "Addition of two negatives failed");
        assertEquals(4.0, calc.add(7, -3), 0.001, "Addition of a positive and a negative failed");
    }

    @Test
    public void testSubtraction() {
        assertEquals(4.0, calc.subtract(7, 3), 0.001, "Subtraction of two positives failed");
        assertEquals(-4.0, calc.subtract(-7, -3), 0.001, "Subtraction of two negatives failed");
        assertEquals(10.0, calc.subtract(7, -3), 0.001, "Subtraction of a positive and a negative failed");
    }

    @Test
    public void testMultiplication() {
        assertEquals(21.0, calc.multiply(7, 3), 0.001, "Multiplication of two positives failed");
        assertEquals(21.0, calc.multiply(-7, -3), 0.001, "Multiplication of two negatives failed");
        assertEquals(-21.0, calc.multiply(7, -3), 0.001, "Multiplication of a positive and a negative failed");
    }

    @Test
    public void testDivision() {
        assertEquals(2.333, calc.divide(7, 3), 0.001, "Division of two positives failed");
        assertEquals(2.333, calc.divide(-7, -3), 0.001, "Division of two negatives failed");
        assertEquals(-2.333, calc.divide(7, -3), 0.001, "Division of a positive and a negative failed");
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(7, 0),
                "Division by zero should throw an ArithmeticException");
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(1000000007.0, calc.add(1000000000, 7), 0.001, "Addition of large numbers failed");
        assertEquals(3000000000.0, calc.multiply(1000000000, 3), 0.001, "Multiplication of large numbers failed");
    }

    @Test
    public void testPrecision() {
        assertEquals(0.3333333, calc.divide(1, 3), 0.0000001, "Precision in division failed");
    }

    @Test
    public void testZeroOperations() {
        assertEquals(7.0, calc.add(7, 0), 0.001, "Addition involving zero failed");
        assertEquals(7.0, calc.subtract(7, 0), 0.001, "Subtraction involving zero failed");
        assertEquals(0.0, calc.multiply(7, 0), 0.001, "Multiplication by zero failed");
    }
}
