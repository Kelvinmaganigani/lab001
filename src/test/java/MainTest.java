import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testMainOutput() {
        String input = "1\n5\n3\nno\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Main.main(null);

        String expectedOutput = "Welcome to the Basic Calculator!\n"
                + "Choose an operation:\n"
                + "1: Addition\n"
                + "2: Subtraction\n"
                + "3: Multiplication\n"
                + "4: Division\n"
                + "5: Exit\n"
                + "Select (1-5): "
                + "Enter the first number: "
                + "Enter the second number: "
                + "Result: 8.0\n"
                + "Do another calculation? (yes/no): "
                + "Thank you for using the Basic Calculator!\n";

        assertEquals(expectedOutput, outputStreamCaptor.toString().replaceAll("\\r\\n", "\n"));
    }

}
